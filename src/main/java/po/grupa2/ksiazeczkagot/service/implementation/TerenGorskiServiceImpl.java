package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.TerenGorski;
import po.grupa2.ksiazeczkagot.persistance.entities.TerenGorskiEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.TerenGorskiService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class TerenGorskiServiceImpl extends BaseCrudService<TerenGorski, TerenGorskiEntity, Long>
    implements TerenGorskiService {

  public TerenGorskiServiceImpl(
      BaseRepository<TerenGorskiEntity, Long> repository,
      BaseMapper<TerenGorski,TerenGorskiEntity> mapper) {
    super(repository, mapper);
  }
}
