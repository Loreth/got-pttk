package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
@Table(name = "PUNKT_Z_WYKAZU")
public class PunktZWykazuEntity extends AbstractPersistable<Long> {
  @OneToOne
  @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
  private PunktEntity punkt;

  @ManyToOne
  @JoinColumn(name = "TEREN_GORSKI", referencedColumnName = "ID", nullable = false)
  private TerenGorskiEntity terenGorski;
}
