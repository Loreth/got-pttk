package po.grupa2.ksiazeczkagot.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
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
  public List<Przedmiot> handleDrawRandomItems(Pageable pageable, @RequestParam int amount) {
    List<Przedmiot> allItems = service.findAll();
    Collections.shuffle(allItems);
    return allItems.stream().limit(amount).collect(Collectors.toList());
  }
}
