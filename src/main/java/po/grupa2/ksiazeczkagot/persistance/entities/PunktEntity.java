package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
@Table(name = "PUNKT", schema = "PUBLIC", catalog = "TEST")
public class PunktEntity extends AbstractPersistable<Long> {
  private String nazwa;
  private Integer wysokosc;

  @ManyToOne
  @JoinColumn(name = "SZEROKOSC_GEOGRAFICZNA", referencedColumnName = "ID", nullable = false)
  private WspolrzednaEntity szerokoscGeograficzna;

  @ManyToOne
  @JoinColumn(name = "DLUGOSC_GEOGRAFICZNA", referencedColumnName = "ID", nullable = false)
  private WspolrzednaEntity dlugoscGeograficzna;
}
