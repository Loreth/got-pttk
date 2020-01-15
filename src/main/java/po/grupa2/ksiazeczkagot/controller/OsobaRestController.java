package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Osoba;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.OSOBA)
public class OsobaRestController extends BaseRestController<Osoba, Long> {
  public OsobaRestController(CrudService<Osoba, Long> service) {
    super(service);
  }
}
