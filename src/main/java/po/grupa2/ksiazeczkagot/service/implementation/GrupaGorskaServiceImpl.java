package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.GrupaGorska;
import po.grupa2.ksiazeczkagot.persistance.entities.GrupaGorskaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.GrupaGorskaService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class GrupaGorskaServiceImpl extends BaseCrudService<GrupaGorska, GrupaGorskaEntity, Long>
    implements GrupaGorskaService {

  public GrupaGorskaServiceImpl(
      BaseRepository<GrupaGorskaEntity, Long> repository,
      BaseMapper<GrupaGorska, GrupaGorskaEntity> mapper) {
    super(repository, mapper);
  }
}
