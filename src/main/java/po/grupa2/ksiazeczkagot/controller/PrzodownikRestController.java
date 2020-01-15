package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Przodownik;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.PRZODOWNIK)
public class PrzodownikRestController extends BaseRestController<Przodownik, Long> {
  public PrzodownikRestController(CrudService<Przodownik, Long> service) {
    super(service);
  }
}
