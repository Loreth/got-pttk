package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Uzytkownik;
import po.grupa2.ksiazeczkagot.persistance.entities.UzytkownikEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.UzytkownikService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class UzytkownikServiceImpl extends BaseCrudService<Uzytkownik, UzytkownikEntity, Long>
    implements UzytkownikService {

  public UzytkownikServiceImpl(
      BaseRepository<UzytkownikEntity, Long> repository,
      BaseMapper<Uzytkownik, UzytkownikEntity> mapper) {
    super(repository, mapper);
  }
}
