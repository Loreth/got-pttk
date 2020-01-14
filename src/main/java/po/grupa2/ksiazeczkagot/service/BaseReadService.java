package po.grupa2.ksiazeczkagot.service;

import java.io.Serializable;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.BaseDto;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

@Service
@Slf4j
@RequiredArgsConstructor
public abstract class BaseReadService<
        T extends BaseDto<ID>, U extends AbstractPersistable<ID>, ID extends Serializable>
    implements ReadService<T, ID> {

  protected final BaseRepository<U, ID> repository;
  protected final BaseMapper<T, U> mapper;

  @Override
  public Page<T> findAll(Pageable pageable) {
    Page<U> allEntities = repository.findAll(pageable);

    return allEntities.map(mapper::mapToDto);
  }

  @Override
  public boolean existsById(ID id) {
    return repository.existsById(id);
  }

  @Override
  public Optional<T> findById(ID id) {
    Optional<U> entityOptional = repository.findById(id);

    return entityOptional.map(mapper::mapToDto);
  }
}
