package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "WSPOLRZEDNA")
public class WspolrzednaEntity extends BaseEntity<Long> {
  private int stopnie;
  private int minuty;
  private double sekundy;
}
