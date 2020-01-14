package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
@Table(name = "WSPOLRZEDNA")
public class WspolrzednaEntity extends AbstractPersistable<Long> {
  private int stopnie;
  private int minuty;
  private int sekundy;
}
