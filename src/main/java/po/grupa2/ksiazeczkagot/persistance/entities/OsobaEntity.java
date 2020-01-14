package po.grupa2.ksiazeczkagot.persistance.entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "OSOBA")
public class OsobaEntity extends UzytkownikEntity {
  private String imie;
  private String nazwisko;
  private Integer wiek;
  private String plec;

  @Column(name = "DATA_URODZENIA")
  private Date dataUrodzenia;
}
