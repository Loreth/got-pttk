package po.grupa2.ksiazeczkagot.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ReadService<T, ID> {

  Page<T> findAll(Pageable pageable);

  boolean existsById(ID id);

  Optional<T> findById(ID id);
}
