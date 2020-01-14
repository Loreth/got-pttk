package po.grupa2.ksiazeczkagot.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.domain.Specification;

public interface SpecificationReadService<
        T, U extends AbstractPersistable<ID>, ID extends Serializable>
    extends ReadService<T, ID> {

  List<T> findAll(Specification<U> specification);

  Page<T> findAll(Specification<U> specification, Pageable pageable);

  List<T> findAll(Specification<U> specification, Sort sort);
}
