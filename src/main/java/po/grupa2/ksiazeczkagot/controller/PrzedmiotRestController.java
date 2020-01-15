package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Przedmiot;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.PRZEDMIOT)
public class PrzedmiotRestController extends BaseRestController<Przedmiot, Long> {
  public PrzedmiotRestController(CrudService<Przedmiot, Long> service) {
    super(service);
  }
}
