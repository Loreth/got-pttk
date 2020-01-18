package po.grupa2.ksiazeczkagot.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Wycieczka;
import po.grupa2.ksiazeczkagot.persistance.entities.WycieczkaEntity;
import po.grupa2.ksiazeczkagot.service.SpecificationCrudService;
import po.grupa2.ksiazeczkagot.specifications.WycieczkaSpecification;

@RestController
@RequestMapping(RestMappings.WYCIECZKA)
public class WycieczkaRestController extends BaseRestController<Wycieczka, Long> {

  private SpecificationCrudService<Wycieczka, WycieczkaEntity, Long> service;

  public WycieczkaRestController(
      SpecificationCrudService<Wycieczka, WycieczkaEntity, Long> service) {
    super(service);
    this.service = service;
  }

  @GetMapping(RestMappings.SEARCH)
  public Page<Wycieczka> getByTouristId(WycieczkaSpecification specification, Pageable pageable) {

    return service.findAll(specification, pageable);
  }
}
