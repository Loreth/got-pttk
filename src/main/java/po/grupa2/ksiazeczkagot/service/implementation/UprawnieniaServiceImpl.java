package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Uprawnienia;
import po.grupa2.ksiazeczkagot.persistance.entities.UprawnieniaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.UprawnieniaService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class UprawnieniaServiceImpl extends BaseCrudService<Uprawnienia, UprawnieniaEntity, Long>
    implements UprawnieniaService {

  public UprawnieniaServiceImpl(
      BaseRepository<UprawnieniaEntity, Long> repository,
      BaseMapper<Uprawnienia, UprawnieniaEntity> mapper) {
    super(repository, mapper);
  }
}
