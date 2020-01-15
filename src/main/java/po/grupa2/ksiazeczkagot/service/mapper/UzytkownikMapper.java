package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.Uzytkownik;
import po.grupa2.ksiazeczkagot.persistance.entities.UzytkownikEntity;

@Mapper
public interface UzytkownikMapper extends BaseMapper<Uzytkownik, UzytkownikEntity> {}
