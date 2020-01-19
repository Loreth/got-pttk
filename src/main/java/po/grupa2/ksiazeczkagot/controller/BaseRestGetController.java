package po.grupa2.ksiazeczkagot.controller;

import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.BaseDto;
import po.grupa2.ksiazeczkagot.service.ReadService;

/**
 * Klasa bazowa dla kontrolera obsługującego zapytania GET
 *
 * @param <T> Typ zwracany i przyjmowany przez metody kontrolera
 * @param <ID> Typ ID encji
 */
@RequiredArgsConstructor
@CrossOrigin(origins = "${cors.origin.angularapp}", allowedHeaders = "*")
@RestController
public abstract class BaseRestGetController<T extends BaseDto<ID>, ID> {

  protected static final String NOT_FOUND_EXCEPTION_MSG = "Entity not found with id=";

  private final ReadService<T, ID> service;

  @GetMapping
  public Page<T> getAll(Pageable pageable) {
    return service.findAll(pageable);
  }

  @GetMapping(RestMappings.ID)
  public T getById(@PathVariable ID id) {
    return service
        .findById(id)
        .orElseThrow(() -> new EntityNotFoundException(NOT_FOUND_EXCEPTION_MSG + id));
  }
}
