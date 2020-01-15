package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Turysta;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.TURYSTA)
public class TurystaRestController extends BaseRestController<Turysta, Long> {
  public TurystaRestController(CrudService<Turysta, Long> service) {
    super(service);
  }
}
