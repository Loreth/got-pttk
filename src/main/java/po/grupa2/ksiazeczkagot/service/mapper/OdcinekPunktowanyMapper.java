package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.OdcinekPunktowany;
import po.grupa2.ksiazeczkagot.persistance.entities.OdcinekPunktowanyEntity;

@Mapper(uses = PunktZWykazuMapper.class)
public interface OdcinekPunktowanyMapper extends BaseMapper<OdcinekPunktowany, OdcinekPunktowanyEntity> {}
