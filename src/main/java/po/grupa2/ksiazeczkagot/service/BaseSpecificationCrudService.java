package po.grupa2.ksiazeczkagot.service;

import java.io.Serializable;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.BaseDto;
import po.grupa2.ksiazeczkagot.persistance.entities.BaseEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

/**
 * Klasa bazowa dla serwisu wspierającego funkcjonalność CRUD z bazą danych, wyszukiwanie encji przy
 * użyciu springowych specyfikacji, oraz wykorzystująca mapowanie pomiędzy dto a encjami
 *
 * @param <T> Typ DTO
 * @param <U> Typ encji
 * @param <ID> Typ ID encji
 */
@Service
@Slf4j
public abstract class BaseSpecificationCrudService<
        T extends BaseDto<ID>, U extends BaseEntity<ID>, ID extends Serializable>
    extends BaseCrudService<T, U, ID> implements SpecificationCrudService<T, U, ID> {

  public BaseSpecificationCrudService(BaseRepository<U, ID> repository, BaseMapper<T, U> mapper) {
    super(repository, mapper);
  }

  @Override
  public List<T> findAll(Specification<U> specification) {
    return mapper.mapToDtoList(repository.findAll(specification));
  }

  @Override
  public Page<T> findAll(Specification<U> specification, Pageable pageable) {
    return repository.findAll(specification, pageable).map(mapper::mapToDto);
  }

  @Override
  public List<T> findAll(Specification<U> specification, Sort sort) {
    return mapper.mapToDtoList(repository.findAll(specification, sort));
  }
}
