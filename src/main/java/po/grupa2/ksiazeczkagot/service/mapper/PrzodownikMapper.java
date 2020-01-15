package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.Przodownik;
import po.grupa2.ksiazeczkagot.persistance.entities.PrzodownikEntity;

@Mapper(uses = {OsobaMapper.class, UprawnieniaMapper.class})
public interface PrzodownikMapper extends BaseMapper<Przodownik, PrzodownikEntity> {}
