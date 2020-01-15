package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.GrupaGorska;
import po.grupa2.ksiazeczkagot.persistance.entities.GrupaGorskaEntity;

@Mapper(uses = TerenGorskiMapper.class)
public interface GrupaGorskaMapper extends BaseMapper<GrupaGorska, GrupaGorskaEntity> {}
