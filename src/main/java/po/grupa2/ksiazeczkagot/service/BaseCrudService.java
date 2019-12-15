package po.grupa2.ksiazeczkagot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import po.grupa2.ksiazeczkagot.dto.BaseDto;
import po.grupa2.ksiazeczkagot.persistance.Identifiable;
import po.grupa2.ksiazeczkagot.persistance.repositories.BaseRepository;
import po.grupa2.ksiazeczkagot.service.mapper.BaseMapper;

import java.util.Optional;

@Service
@Slf4j
public abstract class BaseCrudService<
        T extends BaseDto<ID>, U extends Identifiable<ID>, ID>
    extends BaseReadService<T, U, ID> implements CrudService<T, ID> {

  public BaseCrudService(BaseRepository<U, ID> repository, BaseMapper<T, U> mapper) {
    super(repository, mapper);
  }

  @Override
  public T save(T dto) {
    U savedEntity = repository.save(mapper.mapToEntity(dto));

    return mapper.mapToDto(savedEntity);
  }

  @Override
  public void deleteById(ID id) {
    repository.deleteById(id);
  }

  @Override
  public Optional<T> updateById(T dto, ID id) {
    Optional<U> entityOptional = repository.findById(id);

    return entityOptional.map(
        entity -> {
          dto.setId(id);
          repository.save(mapper.mapToEntity(dto));
          return mapper.mapToDto(entity);
        });
  }

  @Override
  public void deleteAll() {
    repository.deleteAll();
  }
}