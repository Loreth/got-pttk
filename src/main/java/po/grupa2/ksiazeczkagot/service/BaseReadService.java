package po.grupa2.ksiazeczkagot.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.BaseDto;
import po.grupa2.ksiazeczkagot.persistance.entities.BaseEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

/**
 * Klasa bazowa dla serwisu wspierającego odczyt z bazy danych oraz wykorzystująca mapowanie
 * pomiędzy dto a encjami
 *
 * @param <T> Typ DTO
 * @param <U> Typ encji
 * @param <ID> Typ ID encji
 */
@Service
@Slf4j
@RequiredArgsConstructor
public abstract class BaseReadService<
        T extends BaseDto<ID>, U extends BaseEntity<ID>, ID extends Serializable>
    implements ReadService<T, ID> {

  protected final BaseRepository<U, ID> repository;
  protected final BaseMapper<T, U> mapper;

  @Override
  public Page<T> findAll(Pageable pageable) {
    Page<U> allEntities = repository.findAll(pageable);

    return allEntities.map(mapper::mapToDto);
  }

  @Override
  public List<T> findAll() {
    return repository.findAll().stream().map(mapper::mapToDto).collect(Collectors.toList());
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

  @Override
  public long count() {
    return repository.count();
  }
}
