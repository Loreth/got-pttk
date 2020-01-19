package po.grupa2.ksiazeczkagot.specifications;

import net.kaczmarzyk.spring.data.jpa.domain.EqualIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.domain.GreaterThanOrEqual;
import net.kaczmarzyk.spring.data.jpa.domain.In;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.JoinFetch;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Joins;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.data.jpa.domain.Specification;
import po.grupa2.ksiazeczkagot.persistance.entities.OdcinekPunktowanyEntity;

/** Specyfikacja wyszukiwania po parametrach dla odcinka punktowanego */
@Joins(fetch = {@JoinFetch(paths = "punktPoczatkowy"), @JoinFetch(paths = "punktKoncowy")})
@And({
  @Spec(path = "punktacja", params = "punktacjaMin", spec = GreaterThanOrEqual.class),
  @Spec(path = "punktPoczatkowy.nazwa", params = "punktPoczatkowy", spec = EqualIgnoreCase.class),
  @Spec(path = "punktKoncowy.nazwa", params = "punktKoncowy", spec = EqualIgnoreCase.class),
  @Spec(
      path = "punktPoczatkowy.terenGorski.grupaGorska.nazwa",
      params = "grupaGorska",
      spec = EqualIgnoreCase.class),
  @Spec(path = "punktPoczatkowy.terenGorski.nazwa", params = "terenGorski", spec = In.class),
})
public interface OdcinekPunktowanySpecification extends Specification<OdcinekPunktowanyEntity> {}
