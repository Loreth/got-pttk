package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PRZEDMIOT")
public class PrzedmiotEntity extends BaseEntity<Long> {
  private String nazwa;

  @Column(name = "OBRAZEK_URL")
  private String obrazekUrl;
}
