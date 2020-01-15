package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.OdznakaTurysty;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.ODZNAKA_TURYSTY)
public class OdznakaTurystyRestController extends BaseRestController<OdznakaTurysty, Long> {
  public OdznakaTurystyRestController(CrudService<OdznakaTurysty, Long> service) {
    super(service);
  }
}
