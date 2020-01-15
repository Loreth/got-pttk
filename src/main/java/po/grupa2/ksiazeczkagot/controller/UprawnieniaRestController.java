package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Uprawnienia;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.UPRAWNIENIA)
public class UprawnieniaRestController extends BaseRestController<Uprawnienia, Long> {
  public UprawnieniaRestController(CrudService<Uprawnienia, Long> service) {
    super(service);
  }
}
