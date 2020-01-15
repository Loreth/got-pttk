package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import po.grupa2.ksiazeczkagot.dto.OdcinekWycieczki;
import po.grupa2.ksiazeczkagot.persistance.entities.OdcinekWycieczkiEntity;

@Mapper(uses = PunktMapper.class)
public interface OdcinekWycieczkiMapper
    extends BaseMapper<OdcinekWycieczki, OdcinekWycieczkiEntity> {

  @Mapping(target = "wycieczkaId", source = "wycieczka.id")
  @Override
  OdcinekWycieczki mapToDto(OdcinekWycieczkiEntity entity);

  @Override
  @InheritInverseConfiguration(name = "mapToDto")
  OdcinekWycieczkiEntity mapToEntity(OdcinekWycieczki dto);
}
