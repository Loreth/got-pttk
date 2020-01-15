package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Przodownik;
import po.grupa2.ksiazeczkagot.persistance.entities.PrzodownikEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.PrzodownikService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class PrzodownikServiceImpl extends BaseCrudService<Przodownik, PrzodownikEntity, Long>
    implements PrzodownikService {

  public PrzodownikServiceImpl(
      BaseRepository<PrzodownikEntity, Long> repository,
      BaseMapper<Przodownik, PrzodownikEntity> mapper) {
    super(repository, mapper);
  }
}
