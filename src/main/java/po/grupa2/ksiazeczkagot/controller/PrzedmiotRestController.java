package po.grupa2.ksiazeczkagot.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Przedmiot;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.PRZEDMIOT)
public class PrzedmiotRestController extends BaseRestController<Przedmiot, Long> {

  private CrudService<Przedmiot, Long> service;

  public PrzedmiotRestController(CrudService<Przedmiot, Long> service) {
    super(service);
    this.service = service;
  }

  @GetMapping(RestMappings.RANDOM_ITEMS)
  public Page<Przedmiot> handleDrawRandomItems(Pageable pageable, @RequestParam int amount) {
//    Set<Long> itemsIds = service.findAll
//    Collections.shuffle(itemsIds);
//    itemsCount.stream().
//    ThreadLocalRandom.current().longs(1,itemsCount);
//
    return service.findAll(pageable);
  }
}
