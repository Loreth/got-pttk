package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.Osoba;
import po.grupa2.ksiazeczkagot.persistance.entities.OsobaEntity;

@Mapper(uses = UzytkownikMapper.class)
public interface OsobaMapper extends BaseMapper<Osoba, OsobaEntity> {}
