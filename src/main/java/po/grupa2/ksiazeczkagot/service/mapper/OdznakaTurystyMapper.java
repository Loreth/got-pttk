package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import po.grupa2.ksiazeczkagot.dto.OdznakaTurysty;
import po.grupa2.ksiazeczkagot.persistance.entities.OdznakaTurystyEntity;

@Mapper(uses = OdznakaMapper.class)
public interface OdznakaTurystyMapper extends BaseMapper<OdznakaTurysty, OdznakaTurystyEntity> {

  @Mapping(target = "zweryfikowanaPrzezId", source = "zweryfikowanaPrzez.id")
  @Mapping(target = "wlascicielId", source = "wlasciciel.id")
  @Mapping(target = "przyznanaPrzezId", source = "przyznanaPrzez.id")
  @Override
  OdznakaTurysty mapToDto(OdznakaTurystyEntity entity);

  @Override
  @InheritInverseConfiguration(name = "mapToDto")
  OdznakaTurystyEntity mapToEntity(OdznakaTurysty dto);
}
