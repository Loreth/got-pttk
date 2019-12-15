package po.grupa2.ksiazeczkagot.service.mapper;

import java.util.List;

public interface BaseMapper<D, E> {
  D mapToDto(E entity);

  E mapToEntity(D dto);

  List<D> mapToDtoList(List<E> entity);

  List<E> mapToEntityList(List<D> dto);
}
