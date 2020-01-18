package po.grupa2.ksiazeczkagot.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.OdcinekPunktowany;
import po.grupa2.ksiazeczkagot.persistance.entities.OdcinekPunktowanyEntity;
import po.grupa2.ksiazeczkagot.service.SpecificationCrudService;
import po.grupa2.ksiazeczkagot.specifications.OdcinekPunktowanySpecification;

@RestController
@RequestMapping(RestMappings.ODCINEK_PUNKTOWANY)
public class OdcinekPunktowanyRestController extends BaseRestController<OdcinekPunktowany, Long> {
  private final SpecificationCrudService<OdcinekPunktowany, OdcinekPunktowanyEntity, Long> service;

  public OdcinekPunktowanyRestController(
      SpecificationCrudService<OdcinekPunktowany, OdcinekPunktowanyEntity, Long> service) {
    super(service);
    this.service = service;
  }

  @GetMapping(RestMappings.SEARCH)
  public Page<OdcinekPunktowany> getAllWithGivenParameters(
      OdcinekPunktowanySpecification specification, Pageable pageable) {

    return service.findAll(specification, pageable);
  }
}
