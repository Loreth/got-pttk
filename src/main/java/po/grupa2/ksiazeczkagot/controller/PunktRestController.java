package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Punkt;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.PUNKT)
public class PunktRestController extends BaseRestController<Punkt, Long> {
  public PunktRestController(CrudService<Punkt, Long> service) {
    super(service);
  }
}
