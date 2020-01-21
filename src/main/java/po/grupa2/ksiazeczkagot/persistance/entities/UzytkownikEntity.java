package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "UZYTKOWNIK")
@Inheritance(strategy = InheritanceType.JOINED)
public class UzytkownikEntity extends BaseEntity<Long> {
  private String login;
  private String haslo;
  private String email;
}
