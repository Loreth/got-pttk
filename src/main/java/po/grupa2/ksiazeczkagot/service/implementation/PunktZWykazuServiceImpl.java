package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.PunktZWykazu;
import po.grupa2.ksiazeczkagot.persistance.entities.PunktZWykazuEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.PunktZWykazuService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class PunktZWykazuServiceImpl extends BaseCrudService<PunktZWykazu, PunktZWykazuEntity, Long>
    implements PunktZWykazuService {

  public PunktZWykazuServiceImpl(
      BaseRepository<PunktZWykazuEntity, Long> repository,
      BaseMapper<PunktZWykazu,PunktZWykazuEntity> mapper) {
    super(repository, mapper);
  }
}
