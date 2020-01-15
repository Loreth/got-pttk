package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.PracownikRw;
import po.grupa2.ksiazeczkagot.persistance.entities.PracownikRwEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.PracownikRwService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class PracownikRwServiceImpl extends BaseCrudService<PracownikRw, PracownikRwEntity, Long>
    implements PracownikRwService {

  public PracownikRwServiceImpl(
      BaseRepository<PracownikRwEntity, Long> repository,
      BaseMapper<PracownikRw, PracownikRwEntity> mapper) {
    super(repository, mapper);
  }
}
