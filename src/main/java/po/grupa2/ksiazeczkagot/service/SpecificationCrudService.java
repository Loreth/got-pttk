package po.grupa2.ksiazeczkagot.service;

import java.io.Serializable;
import org.springframework.data.jpa.domain.AbstractPersistable;
import po.grupa2.ksiazeczkagot.dto.BaseDto;

public interface SpecificationCrudService<
        T extends BaseDto<ID>, U extends AbstractPersistable<ID>, ID extends Serializable>
    extends CrudService<T, ID>, SpecificationReadService<T, U, ID> {}
