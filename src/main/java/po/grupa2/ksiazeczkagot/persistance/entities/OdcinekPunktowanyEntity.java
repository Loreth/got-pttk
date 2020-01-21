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
@Table(name = "ODCINEK_PUNKTOWANY")
public class OdcinekPunktowanyEntity extends BaseEntity<Long> {
  private int punktacja;
  private Integer odleglosc;

  @ManyToOne
  @JoinColumn(name = "PUNKT_POCZATKOWY", referencedColumnName = "ID", nullable = false)
  private PunktZWykazuEntity punktPoczatkowy;

  @ManyToOne
  @JoinColumn(name = "PUNKT_KONCOWY", referencedColumnName = "ID", nullable = false)
  private PunktZWykazuEntity punktKoncowy;
}
