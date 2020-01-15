package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Wycieczka;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.WYCIECZKA)
public class WycieczkaRestController extends BaseRestController<Wycieczka, Long> {
  public WycieczkaRestController(CrudService<Wycieczka, Long> service) {
    super(service);
  }
}
