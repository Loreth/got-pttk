package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Odznaka;
import po.grupa2.ksiazeczkagot.persistance.entities.OdznakaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.OdznakaService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class OdznakaServiceImpl extends BaseCrudService<Odznaka, OdznakaEntity, Long>
    implements OdznakaService {

  public OdznakaServiceImpl(
      BaseRepository<OdznakaEntity, Long> repository, BaseMapper<Odznaka, OdznakaEntity> mapper) {
    super(repository, mapper);
  }
}
