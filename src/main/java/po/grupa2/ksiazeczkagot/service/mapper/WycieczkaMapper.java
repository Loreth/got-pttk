package po.grupa2.ksiazeczkagot.service.mapper;

import javax.persistence.EntityNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import po.grupa2.ksiazeczkagot.dto.OdcinekWycieczki;
import po.grupa2.ksiazeczkagot.dto.Wycieczka;
import po.grupa2.ksiazeczkagot.persistance.entities.OdcinekWycieczkiEntity;
import po.grupa2.ksiazeczkagot.persistance.entities.OdznakaTurystyEntity;
import po.grupa2.ksiazeczkagot.persistance.entities.WycieczkaEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.OdcinekWycieczkiRepository;
import po.grupa2.ksiazeczkagot.persistance.repositories.OdznakaTurystyRepository;

@Mapper(uses = {EntityFactory.class})
public abstract class WycieczkaMapper implements BaseMapper<Wycieczka, WycieczkaEntity> {
  @Autowired private OdznakaTurystyRepository odznakaTurystyRepository;
  @Autowired private OdcinekWycieczkiRepository odcinekWycieczkiRepository;

  @Mapping(target = "przynaleznaOdznakaId", source = "przynaleznaOdznaka.id")
  @Mapping(target = "potwierdzonaPrzezId", source = "potwierdzonaPrzez.id")
  @Override
  public abstract Wycieczka mapToDto(WycieczkaEntity entity);

  @Mapping(target = "przynaleznaOdznaka", source = "przynaleznaOdznakaId")
  @Mapping(target = "potwierdzonaPrzez", ignore = true)
  @Mapping(target = "potwierdzona", ignore = true)
  @Override
  public abstract WycieczkaEntity mapToEntity(Wycieczka dto);

  OdznakaTurystyEntity odznakaTurystyFromId(Long id) {
    return odznakaTurystyRepository.findById(id).orElseThrow(EntityNotFoundException::new);
  }

  OdcinekWycieczkiEntity odcinekWycieczkiEntityFromOdcinekWycieczki(
      OdcinekWycieczki odcinekWycieczki) {
    return odcinekWycieczkiRepository
        .findById(odcinekWycieczki.getId())
        .orElseThrow(EntityNotFoundException::new);
  }
}
