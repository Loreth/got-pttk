package po.grupa2.ksiazeczkagot.service.mapper;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.mapstruct.ObjectFactory;
import org.mapstruct.TargetType;
import org.springframework.stereotype.Component;
import po.grupa2.ksiazeczkagot.dto.BaseDto;
import po.grupa2.ksiazeczkagot.persistance.entities.BaseEntity;

@Component
public class EntityFactory {
  @PersistenceContext private EntityManager em;

  @ObjectFactory
  public <T extends BaseEntity<?>> T resolveEntity(
      BaseDto<?> dto, @TargetType Class<T> entityClass) {
    T entity = null;

    if (dto.getId() != null) {
      entity = em.find(entityClass, dto.getId());
    }

    if (entity == null) {
      try {
        entity = entityClass.newInstance();
      } catch (InstantiationException | IllegalAccessException e) {
        e.printStackTrace();
      }
    }

    return entity;
  }
}
