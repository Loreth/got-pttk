package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Odznaka;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.ODZNAKA)
public class OdznakaRestController extends BaseRestController<Odznaka, Long> {
  public OdznakaRestController(CrudService<Odznaka, Long> service) {
    super(service);
  }
}
