package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.Wspolrzedna;
import po.grupa2.ksiazeczkagot.persistance.entities.WspolrzednaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseCrudService;
import po.grupa2.ksiazeczkagot.service.WspolrzednaService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class WspolrzednaServiceImpl extends BaseCrudService<Wspolrzedna, WspolrzednaEntity, Long>
    implements WspolrzednaService {

  public WspolrzednaServiceImpl(
      BaseRepository<WspolrzednaEntity, Long> repository,
      BaseMapper<Wspolrzedna,WspolrzednaEntity> mapper) {
    super(repository, mapper);
  }
}
