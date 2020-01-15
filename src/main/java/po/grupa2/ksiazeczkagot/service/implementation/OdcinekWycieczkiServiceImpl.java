package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.OdcinekWycieczki;
import po.grupa2.ksiazeczkagot.persistance.entities.OdcinekWycieczkiEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.OdcinekWycieczkiService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class OdcinekWycieczkiServiceImpl
    extends BaseCrudService<OdcinekWycieczki, OdcinekWycieczkiEntity, Long>
    implements OdcinekWycieczkiService {

  public OdcinekWycieczkiServiceImpl(
      BaseRepository<OdcinekWycieczkiEntity, Long> repository,
      BaseMapper<OdcinekWycieczki, OdcinekWycieczkiEntity> mapper) {
    super(repository, mapper);
  }
}
