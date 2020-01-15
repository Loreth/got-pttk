package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.Wspolrzedna;
import po.grupa2.ksiazeczkagot.persistance.entities.WspolrzednaEntity;

@Mapper
public interface WspolrzednaMapper extends BaseMapper<Wspolrzedna, WspolrzednaEntity> {}
