package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.TerenGorski;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.TEREN_GORSKI)
public class TerenGorskiRestController extends BaseRestController<TerenGorski, Long> {
  public TerenGorskiRestController(CrudService<TerenGorski, Long> service) {
    super(service);
  }
}
