package po.grupa2.ksiazeczkagot.dto;

import java.sql.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PracownikRw extends Osoba {

  public PracownikRw(
      String login,
      String haslo,
      String email,
      String imie,
      String nazwisko,
      Integer wiek,
      String plec,
      Date dataUrodzenia) {
    super(login, haslo, email, imie, nazwisko, wiek, plec, dataUrodzenia);
  }
}
