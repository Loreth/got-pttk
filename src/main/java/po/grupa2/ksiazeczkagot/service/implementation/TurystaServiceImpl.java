package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Turysta;
import po.grupa2.ksiazeczkagot.persistance.entities.TurystaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.TurystaService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class TurystaServiceImpl extends BaseCrudService<Turysta, TurystaEntity, Long>
    implements TurystaService {

  public TurystaServiceImpl(
      BaseRepository<TurystaEntity, Long> repository, BaseMapper<Turysta, TurystaEntity> mapper) {
    super(repository, mapper);
  }
}
