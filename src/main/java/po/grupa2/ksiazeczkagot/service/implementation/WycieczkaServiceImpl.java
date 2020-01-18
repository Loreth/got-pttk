package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Wycieczka;
import po.grupa2.ksiazeczkagot.persistance.entities.WycieczkaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseSpecificationCrudService;
import po.grupa2.ksiazeczkagot.service.WycieczkaService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class WycieczkaServiceImpl
    extends BaseSpecificationCrudService<Wycieczka, WycieczkaEntity, Long>
    implements WycieczkaService {

  public WycieczkaServiceImpl(
      BaseRepository<WycieczkaEntity, Long> repository,
      BaseMapper<Wycieczka, WycieczkaEntity> mapper) {
    super(repository, mapper);
  }
}
