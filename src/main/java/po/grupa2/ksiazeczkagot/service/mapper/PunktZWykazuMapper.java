package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import po.grupa2.ksiazeczkagot.dto.PunktZWykazu;
import po.grupa2.ksiazeczkagot.persistance.entities.PunktZWykazuEntity;

@Mapper(uses = WspolrzednaMapper.class)
public interface PunktZWykazuMapper extends BaseMapper<PunktZWykazu, PunktZWykazuEntity> {

  @Override
  @Mapping(target = "terenGorskiId", source = "terenGorski.id")
  PunktZWykazu mapToDto(PunktZWykazuEntity entity);

  @Override
  @InheritInverseConfiguration(name = "mapToDto")
  PunktZWykazuEntity mapToEntity(PunktZWykazu dto);
}
