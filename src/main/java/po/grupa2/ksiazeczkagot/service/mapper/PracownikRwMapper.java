package po.grupa2.ksiazeczkagot.service.mapper;

import org.mapstruct.Mapper;
import po.grupa2.ksiazeczkagot.dto.PracownikRw;
import po.grupa2.ksiazeczkagot.persistance.entities.PracownikRwEntity;

@Mapper(uses = OsobaMapper.class)
public interface PracownikRwMapper extends BaseMapper<PracownikRw, PracownikRwEntity> {}
