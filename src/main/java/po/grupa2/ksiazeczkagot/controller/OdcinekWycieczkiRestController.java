package po.grupa2.ksiazeczkagot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import po.grupa2.ksiazeczkagot.dto.OdcinekWycieczki;
import po.grupa2.ksiazeczkagot.service.CrudService;

@RestController
@RequestMapping(RestMappings.ODCINEK_WYCIECZKI)
public class OdcinekWycieczkiRestController extends BaseRestController<OdcinekWycieczki, Long> {
  public OdcinekWycieczkiRestController(CrudService<OdcinekWycieczki, Long> service) {
    super(service);
  }
}
