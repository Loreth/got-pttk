package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "UPRAWNIENIA")
public class UprawnieniaEntity extends BaseEntity<Long> {
  @ManyToOne
  @JoinColumn(name = "PRZODOWNIK", referencedColumnName = "ID", nullable = false)
  private PrzodownikEntity przodownik;

  @ManyToOne
  @JoinColumn(name = "GRUPA_GORSKA", referencedColumnName = "ID", nullable = false)
  private GrupaGorskaEntity grupaGorska;
}
