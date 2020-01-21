package po.grupa2.ksiazeczkagot.persistance.entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEREN_GORSKI")
public class TerenGorskiEntity extends BaseEntity<Long> {
  private String nazwa;

  @OneToMany(mappedBy = "terenGorski")
  private Collection<PunktZWykazuEntity> punktyZWykazu;

  @ManyToOne
  @JoinColumn(name = "GRUPA_GORSKA", referencedColumnName = "ID", nullable = false)
  private GrupaGorskaEntity grupaGorska;
}
