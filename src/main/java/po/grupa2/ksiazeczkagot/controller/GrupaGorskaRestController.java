package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.GrupaGorska;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.GRUPA_GORSKA)
public class GrupaGorskaRestController extends BaseRestController<GrupaGorska, Long> {
  public GrupaGorskaRestController(
      CrudService<GrupaGorska, Long> service) {
    super(service);
  }
}
