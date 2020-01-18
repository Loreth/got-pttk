package po.grupa2.ksiazeczkagot.controller;

import java.net.URI;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriTemplate;
import po.grupa2.ksiazeczkagot.dto.BaseDto;
import po.grupa2.ksiazeczkagot.service.CrudService;
import po.grupa2.ksiazeczkagot.validation.groups.OnCreate;
import po.grupa2.ksiazeczkagot.validation.groups.OnPut;

@RestController
@CrossOrigin(origins = "${cors.origin.angularapp}", allowedHeaders = "*")
@Validated
public abstract class BaseRestController<T extends BaseDto<ID>, ID>
    extends BaseRestGetController<T, ID> {

  protected static final String ENTITY_EXISTS_EXCEPTION_MSG = "Entity already exists with id=";
  protected static final String ENTITY_NOT_FOUND_EXCEPTION_MSG = "Entity not found with id=";

  public BaseRestController(CrudService<T, ID> service) {
    super(service);
    this.service = service;
  }

  private final CrudService<T, ID> service;

  @Validated(OnCreate.class)
  @PostMapping
  public ResponseEntity<T> create(@Valid @RequestBody T dto, HttpServletRequest request) {
    if (dto.getId() != null && service.existsById(dto.getId())) {
      throw new EntityExistsException(ENTITY_EXISTS_EXCEPTION_MSG + dto.getId());
    }

    T savedEntity = service.save(dto);
    final URI entityMapping =
        new UriTemplate(request.getRequestURI() + RestMappings.ID).expand(savedEntity.getId());

    return ResponseEntity.created(entityMapping).body(savedEntity);
  }

  @DeleteMapping(RestMappings.ID)
  public void deleteById(@PathVariable ID id) {
    if (!service.existsById(id)) {
      throw new EntityNotFoundException(ENTITY_NOT_FOUND_EXCEPTION_MSG + id);
    }

    service.deleteById(id);
  }

  @Validated(OnPut.class)
  @PutMapping(RestMappings.ID)
  public T updateById(@Valid @RequestBody T dto, @PathVariable ID id) {
    T responseDto;

    if (service.existsById(id)) {
      dto.setId(id);
      responseDto = service.save(dto);
    } else {
      throw new EntityNotFoundException(NOT_FOUND_EXCEPTION_MSG + id);
    }

    return responseDto;
  }
}
