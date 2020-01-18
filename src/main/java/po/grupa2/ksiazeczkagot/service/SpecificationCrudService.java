package po.grupa2.ksiazeczkagot.service;

import java.io.Serializable;
import po.grupa2.ksiazeczkagot.dto.BaseDto;
import po.grupa2.ksiazeczkagot.persistance.entities.BaseEntity;

public interface SpecificationCrudService<
        T extends BaseDto<ID>, U extends BaseEntity<ID>, ID extends Serializable>
    extends CrudService<T, ID>, SpecificationReadService<T, U, ID> {}
