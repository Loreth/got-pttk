package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Przedmiot;
import po.grupa2.ksiazeczkagot.persistance.entities.PrzedmiotEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.PrzedmiotService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class PrzedmiotServiceImpl extends BaseCrudService<Przedmiot, PrzedmiotEntity, Long>
    implements PrzedmiotService {

  public PrzedmiotServiceImpl(
      BaseRepository<PrzedmiotEntity, Long> repository,
      BaseMapper<Przedmiot, PrzedmiotEntity> mapper) {
    super(repository, mapper);
  }
}
