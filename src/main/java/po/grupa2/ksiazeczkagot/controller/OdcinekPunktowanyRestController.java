package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.OdcinekPunktowany;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.ODCINEK_PUNKTOWANY)
public class OdcinekPunktowanyRestController extends BaseRestController<OdcinekPunktowany, Long> {
  public OdcinekPunktowanyRestController(CrudService<OdcinekPunktowany, Long> service) {
    super(service);
  }
}
