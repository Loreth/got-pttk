package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Uzytkownik;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.UZYTKOWNIK)
public class UzytkownikRestController extends BaseRestController<Uzytkownik, Long> {
  public UzytkownikRestController(CrudService<Uzytkownik, Long> service) {
    super(service);
  }
}
