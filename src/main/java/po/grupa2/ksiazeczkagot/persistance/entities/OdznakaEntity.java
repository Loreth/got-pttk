package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
@Table(name = "ODZNAKA")
public class OdznakaEntity extends AbstractPersistable<Long> {
  private String rodzaj;
  private String stopien;

  @Column(name = "WYMAGANE_PUNKTY")
  private int wymaganePunkty;
}
