package po.grupa2.ksiazeczkagot.specifications;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import lombok.Data;
import org.springframework.data.jpa.domain.Specification;
import po.grupa2.ksiazeczkagot.persistance.entities.OdznakaTurystyEntity_;
import po.grupa2.ksiazeczkagot.persistance.entities.TurystaEntity_;
import po.grupa2.ksiazeczkagot.persistance.entities.WycieczkaEntity;
import po.grupa2.ksiazeczkagot.persistance.entities.WycieczkaEntity_;

/** Specyfikacja wyszukiwania po parametrach dla wycieczki */
@Data
public class WycieczkaSpecification implements Specification<WycieczkaEntity> {
  private final Long turystaId;

  @Override
  public Predicate toPredicate(
      Root<WycieczkaEntity> root, CriteriaQuery<?> cq, CriteriaBuilder cb) {

    if (turystaId != null) {
      cq.where(
          cb.and(
              cb.equal(
                  root.get(WycieczkaEntity_.przynaleznaOdznaka)
                      .get(OdznakaTurystyEntity_.wlasciciel)
                      .get(TurystaEntity_.id),
                  turystaId)));
    }

    return cq.getRestriction();
  }
}
