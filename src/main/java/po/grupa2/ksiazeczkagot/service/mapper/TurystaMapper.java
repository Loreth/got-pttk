package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import po.grupa2.ksiazeczkagot.dto.Turysta;
import po.grupa2.ksiazeczkagot.persistance.entities.TurystaEntity;

@Mapper(uses = {OsobaMapper.class, EntityFactory.class})
public interface TurystaMapper extends BaseMapper<Turysta, TurystaEntity> {
  @Mapping(target = "zdobywanaOdznakaId", source = "zdobywanaOdznaka.id")
  @Override
  Turysta mapToDto(TurystaEntity entity);

  @Override
  @InheritInverseConfiguration(name = "mapToDto")
  TurystaEntity mapToEntity(Turysta dto);
}
