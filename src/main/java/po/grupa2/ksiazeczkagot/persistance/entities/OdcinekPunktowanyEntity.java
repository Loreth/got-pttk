package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
@Table(name = "ODCINEK_PUNKTOWANY")
public class OdcinekPunktowanyEntity extends AbstractPersistable<Long> {
  private int punktacja;

  @ManyToOne
  @JoinColumn(name = "PUNKT_POCZATKOWY", referencedColumnName = "PUNKT_ID", nullable = false)
  private PunktZWykazuEntity punktPoczatkowy;

  @ManyToOne
  @JoinColumn(name = "PUNKT_KONCOWY", referencedColumnName = "PUNKT_ID", nullable = false)
  private PunktZWykazuEntity punktKoncowy;
}
