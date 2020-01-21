package po.grupa2.ksiazeczkagot.controller;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Przedmiot;
import po.grupa2.ksiazeczkagot.service.PrzedmiotService;

@RestController
@RequestMapping(RestMappings.PRZEDMIOT)
public class PrzedmiotRestController extends BaseRestController<Przedmiot, Long> {

  private PrzedmiotService service;

  public PrzedmiotRestController(PrzedmiotService service) {
    super(service);
    this.service = service;
  }

  @GetMapping(RestMappings.RANDOM_ITEMS)
  public List<Przedmiot> handleDrawRandomItems(Pageable pageable, @RequestParam int amount) {
    return service.drawRandomItems(amount);
  }
}
