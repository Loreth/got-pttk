package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import po.grupa2.ksiazeczkagot.dto.Uprawnienia;
import po.grupa2.ksiazeczkagot.persistance.entities.UprawnieniaEntity;

@Mapper
public interface UprawnieniaMapper extends BaseMapper<Uprawnienia, UprawnieniaEntity> {

  @Mapping(target = "przodownikId", source = "przodownik.id")
  @Mapping(target = "grupaGorskaId", source = "grupaGorska.id")
  @Override
  Uprawnienia mapToDto(UprawnieniaEntity entity);

  @Override
  @InheritInverseConfiguration(name = "mapToDto")
  UprawnieniaEntity mapToEntity(Uprawnienia dto);
}
