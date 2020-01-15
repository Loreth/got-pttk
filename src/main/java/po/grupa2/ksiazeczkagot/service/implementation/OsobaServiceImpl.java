package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Osoba;
import po.grupa2.ksiazeczkagot.persistance.entities.OsobaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.OsobaService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class OsobaServiceImpl extends BaseCrudService<Osoba, OsobaEntity, Long>
    implements OsobaService {

  public OsobaServiceImpl(
      BaseRepository<OsobaEntity, Long> repository, BaseMapper<Osoba, OsobaEntity> mapper) {
    super(repository, mapper);
  }
}
