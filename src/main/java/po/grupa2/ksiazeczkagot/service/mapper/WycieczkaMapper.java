package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import po.grupa2.ksiazeczkagot.dto.Wycieczka;
import po.grupa2.ksiazeczkagot.persistance.entities.WycieczkaEntity;

@Mapper(uses = OdcinekWycieczkiMapper.class)
public interface WycieczkaMapper extends BaseMapper<Wycieczka, WycieczkaEntity> {

  @Mapping(target = "przynaleznaOdznakaId", source = "przynaleznaOdznaka.id")
  @Mapping(target = "potwierdzonaPrzezId", source = "potwierdzonaPrzez.id")
  @Override
  Wycieczka mapToDto(WycieczkaEntity entity);

  @Override
  @InheritInverseConfiguration(name = "mapToDto")
  WycieczkaEntity mapToEntity(Wycieczka dto);
}
