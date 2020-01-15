package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.Punkt;
import po.grupa2.ksiazeczkagot.persistance.entities.PunktEntity;

@Mapper(uses = WspolrzednaMapper.class)
public interface PunktMapper extends BaseMapper<Punkt, PunktEntity> {}
