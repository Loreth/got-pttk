package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
@Table(name = "PRZEDMIOT")
public class PrzedmiotEntity extends AbstractPersistable<Long> {
  private String nazwa;
  private byte[] obrazek;
}
