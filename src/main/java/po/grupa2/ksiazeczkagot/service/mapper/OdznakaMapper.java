package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.Odznaka;
import po.grupa2.ksiazeczkagot.persistance.entities.OdznakaEntity;

@Mapper
public interface OdznakaMapper extends BaseMapper<Odznaka, OdznakaEntity> {}
