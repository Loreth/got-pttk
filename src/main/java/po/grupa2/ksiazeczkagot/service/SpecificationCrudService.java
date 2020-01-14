package po.grupa2.ksiazeczkagot.service;

import java.io.Serializable;
import org.springframework.data.jpa.domain.AbstractPersistable;

public interface SpecificationCrudService<
        T, U extends AbstractPersistable<ID>, ID extends Serializable>
    extends CrudService<T, ID>, SpecificationReadService<T, U, ID> {}
