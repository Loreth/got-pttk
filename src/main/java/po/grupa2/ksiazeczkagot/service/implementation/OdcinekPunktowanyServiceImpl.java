package po.grupa2.ksiazeczkagot.service.implementation;

import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.OdcinekPunktowany;
import po.grupa2.ksiazeczkagot.persistance.entities.OdcinekPunktowanyEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.BaseSpecificationCrudService;
import po.grupa2.ksiazeczkagot.service.OdcinekPunktowanyService;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
public class OdcinekPunktowanyServiceImpl
    extends BaseSpecificationCrudService<OdcinekPunktowany, OdcinekPunktowanyEntity, Long>
    implements OdcinekPunktowanyService {

  public OdcinekPunktowanyServiceImpl(
      BaseRepository<OdcinekPunktowanyEntity, Long> repository,
      BaseMapper<OdcinekPunktowany, OdcinekPunktowanyEntity> mapper) {
    super(repository, mapper);
  }
}
