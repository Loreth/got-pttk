package po.grupa2.ksiazeczkagot.service.mapper;

import javax.persistence.EntityNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import po.grupa2.ksiazeczkagot.dto.Wycieczka;
import po.grupa2.ksiazeczkagot.persistance.entities.OdznakaTurystyEntity;
import po.grupa2.ksiazeczkagot.persistance.entities.WycieczkaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.OdznakaTurystyRepository;

@Mapper(uses = {EntityFactory.class})
public abstract class WycieczkaMapper implements BaseMapper<Wycieczka, WycieczkaEntity> {
  @Autowired private OdznakaTurystyRepository odznakaTurystyRepository;

  @Mapping(target = "przynaleznaOdznakaId", source = "przynaleznaOdznaka.id")
  @Mapping(target = "potwierdzonaPrzezId", source = "potwierdzonaPrzez.id")
  @Override
  public abstract Wycieczka mapToDto(WycieczkaEntity entity);

  @Mapping(target = "przynaleznaOdznaka", source = "przynaleznaOdznakaId")
  @Mapping(target = "potwierdzonaPrzez", ignore = true)
  @Mapping(target = "potwierdzona", ignore = true)
  @Mapping(target = "odcinkiWycieczki", ignore = true)
  @Override
  public abstract WycieczkaEntity mapToEntity(Wycieczka dto);

  OdznakaTurystyEntity odznakaTurystyFromId(Long id) {
    return odznakaTurystyRepository.findById(id).orElseThrow(EntityNotFoundException::new);
  }
}
