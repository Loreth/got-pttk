package po.grupa2.ksiazeczkagot.service;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import po.grupa2.ksiazeczkagot.dto.BaseDto;
import po.grupa2.ksiazeczkagot.persistance.entities.BaseEntity;

public interface SpecificationReadService<
        T extends BaseDto<ID>, U extends BaseEntity<ID>, ID extends Serializable>
    extends ReadService<T, ID> {

  List<T> findAll(Specification<U> specification);

  Page<T> findAll(Specification<U> specification, Pageable pageable);

  List<T> findAll(Specification<U> specification, Sort sort);
}
