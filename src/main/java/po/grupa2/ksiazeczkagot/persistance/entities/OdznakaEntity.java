package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ODZNAKA")
public class OdznakaEntity extends BaseEntity<Long> {
  private String rodzaj;
  private String stopien;

  @Column(name = "WYMAGANE_PUNKTY")
  private int wymaganePunkty;
}
