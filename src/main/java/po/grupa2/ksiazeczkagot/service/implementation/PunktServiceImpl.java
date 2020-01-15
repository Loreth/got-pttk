package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Punkt;
import po.grupa2.ksiazeczkagot.persistance.entities.PunktEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.PunktService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class PunktServiceImpl extends BaseCrudService<Punkt, PunktEntity, Long>
    implements PunktService {

  public PunktServiceImpl(
      BaseRepository<PunktEntity, Long> repository, BaseMapper<Punkt, PunktEntity> mapper) {
    super(repository, mapper);
  }
}
