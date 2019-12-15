package po.grupa2.ksiazeczkagot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import po.grupa2.ksiazeczkagot.persistance.Identifiable;

import java.util.List;

public interface SpecificationReadService<T, U extends Identifiable<ID>, ID>
        extends ReadService<T, ID> {

    List<T> findAll(Specification<U> specification);

    Page<T> findAll(Specification<U> specification, Pageable pageable);

    List<T> findAll(Specification<U> specification, Sort sort);
}
