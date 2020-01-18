package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PUNKT")
@Inheritance(strategy = InheritanceType.JOINED)
public class PunktEntity extends BaseEntity<Long> {
  private String nazwa;
  private Integer wysokosc;

  @ManyToOne
  @JoinColumn(name = "SZEROKOSC_GEOGRAFICZNA", referencedColumnName = "ID")
  private WspolrzednaEntity szerokoscGeograficzna;

  @ManyToOne
  @JoinColumn(name = "DLUGOSC_GEOGRAFICZNA", referencedColumnName = "ID")
  private WspolrzednaEntity dlugoscGeograficzna;
}
