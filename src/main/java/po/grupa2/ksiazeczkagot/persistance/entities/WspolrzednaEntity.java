package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "WSPOLRZEDNA")
public class WspolrzednaEntity extends BaseEntity<Long> {
  private int stopnie;
  private int minuty;
  private double sekundy;
}
