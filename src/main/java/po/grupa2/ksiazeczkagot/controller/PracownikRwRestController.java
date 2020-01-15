package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.PracownikRw;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.PRACOWNIK_RW)
public class PracownikRwRestController extends BaseRestController<PracownikRw, Long> {
  public PracownikRwRestController(CrudService<PracownikRw, Long> service) {
    super(service);
  }
}
