package po.grupa2.ksiazeczkagot.service.mapper;

import javax.persistence.EntityNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import po.grupa2.ksiazeczkagot.dto.OdcinekWycieczki;
import po.grupa2.ksiazeczkagot.persistance.entities.OdcinekWycieczkiEntity;
import po.grupa2.ksiazeczkagot.persistance.entities.PunktEntity;
import po.grupa2.ksiazeczkagot.persistance.entities.WycieczkaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.PunktRepository;
import po.grupa2.ksiazeczkagot.persistance.repositories.WycieczkaRepository;

@Mapper(uses = {EntityFactory.class})
public abstract class OdcinekWycieczkiMapper
    implements BaseMapper<OdcinekWycieczki, OdcinekWycieczkiEntity> {
  @Autowired private PunktRepository punktRepository;
  @Autowired private WycieczkaRepository wycieczkaRepository;

  @Mapping(target = "wycieczkaId", source = "wycieczka.id")
  @Override
  public abstract OdcinekWycieczki mapToDto(OdcinekWycieczkiEntity entity);

  @Override
  @Mapping(target = "punktPoczatkowy", source = "punktPoczatkowy.id")
  @Mapping(target = "punktKoncowy", source = "punktKoncowy.id")
  @Mapping(target = "wycieczka", source = "wycieczkaId")
  public abstract OdcinekWycieczkiEntity mapToEntity(OdcinekWycieczki dto);

  PunktEntity punktFromId(Long id) {
    return punktRepository.findById(id).orElseThrow(EntityNotFoundException::new);
  }

  WycieczkaEntity wycieczkaRepository(Long id) {
    return wycieczkaRepository.findById(id).orElseThrow(EntityNotFoundException::new);
  }
}
