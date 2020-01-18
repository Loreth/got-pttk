package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "UZYTKOWNIK")
@Inheritance(strategy = InheritanceType.JOINED)
public class UzytkownikEntity extends BaseEntity<Long> {
  private String login;
  private String haslo;
  private String email;
}
