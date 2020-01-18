package po.grupa2.ksiazeczkagot.persistance.entities;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
@Table(name = "GRUPA_GORSKA")
@SequenceGenerator(name = "")
public class GrupaGorskaEntity extends AbstractPersistable<Long> {
  @Column(name = "NAZWA")
  private String nazwa;

  @OneToMany(mappedBy = "grupaGorska")
  private Collection<TerenGorskiEntity> terenyGorskie;
}
