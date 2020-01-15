package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.Wspolrzedna;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.WSPOLRZEDNA)
public class WspolrzednaRestController extends BaseRestController<Wspolrzedna, Long> {
  public WspolrzednaRestController(CrudService<Wspolrzedna, Long> service) {
    super(service);
  }
}
