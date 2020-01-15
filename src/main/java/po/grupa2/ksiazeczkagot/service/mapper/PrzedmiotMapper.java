package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.Przedmiot;
import po.grupa2.ksiazeczkagot.persistance.entities.PrzedmiotEntity;

@Mapper(uses = TerenGorskiMapper.class)
public interface PrzedmiotMapper extends BaseMapper<Przedmiot, PrzedmiotEntity> {}
