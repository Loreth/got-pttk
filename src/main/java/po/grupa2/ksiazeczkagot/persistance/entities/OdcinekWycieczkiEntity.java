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
@Table(name = "ODCINEK_WYCIECZKI")
public class OdcinekWycieczkiEntity extends BaseEntity<Long> {
  private Integer punktacja;
  private Boolean punktowany;
  private Integer odleglosc;
  private Integer przewyzszenie;

  @ManyToOne
  @JoinColumn(name = "PUNKT_POCZATKOWY", referencedColumnName = "ID", nullable = false)
  private PunktEntity punktPoczatkowy;

  @ManyToOne
  @JoinColumn(name = "PUNKT_KONCOWY", referencedColumnName = "ID", nullable = false)
  private PunktEntity punktKoncowy;

  @ManyToOne
  @JoinColumn(name = "WYCIECZKA", referencedColumnName = "ID", nullable = false)
  private WycieczkaEntity wycieczka;
}
