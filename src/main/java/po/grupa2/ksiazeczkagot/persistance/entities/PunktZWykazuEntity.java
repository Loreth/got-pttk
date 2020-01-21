package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PUNKT_Z_WYKAZU")
public class PunktZWykazuEntity extends PunktEntity {
  @ManyToOne
  @JoinColumn(name = "TEREN_GORSKI", referencedColumnName = "ID", nullable = false)
  private TerenGorskiEntity terenGorski;
}
