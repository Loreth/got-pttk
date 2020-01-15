package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.PunktZWykazu;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.PUNKT_Z_WYKAZU)
public class PunktZWykazuRestController extends BaseRestController<PunktZWykazu, Long> {
  public PunktZWykazuRestController(
      CrudService<PunktZWykazu, Long> service) {
    super(service);
  }
}
