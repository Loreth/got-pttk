package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.OdznakaTurysty;
import po.grupa2.ksiazeczkagot.persistance.entities.OdznakaTurystyEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.OdznakaTurystyService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class OdznakaTurystyServiceImpl
    extends BaseCrudService<OdznakaTurysty, OdznakaTurystyEntity, Long>
    implements OdznakaTurystyService {

  public OdznakaTurystyServiceImpl(
      BaseRepository<OdznakaTurystyEntity, Long> repository,
      BaseMapper<OdznakaTurysty, OdznakaTurystyEntity> mapper) {
    super(repository, mapper);
  }
}
