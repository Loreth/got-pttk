package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import po.grupa2.ksiazeczkagot.dto.TerenGorski;
import po.grupa2.ksiazeczkagot.persistance.entities.TerenGorskiEntity;

@Mapper(uses = PunktZWykazuMapper.class)
public interface TerenGorskiMapper extends BaseMapper<TerenGorski, TerenGorskiEntity> {

  @Override
  @Mapping(source = "grupaGorska.id", target = "grupaGorskaId")
  TerenGorski mapToDto(TerenGorskiEntity entity);

  @Override
  @InheritInverseConfiguration(name = "mapToDto")
  TerenGorskiEntity mapToEntity(TerenGorski dto);
}
