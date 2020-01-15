package po.grupa2.ksiazeczkagot.dto;

import java.sql.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Przodownik extends Osoba {
  private String numerLegitymacji;
  private List<Uprawnienia> uprawnienia;

  public Przodownik(
      String login,
      String haslo,
      String email,
      String imie,
      String nazwisko,
      Integer wiek,
      String plec,
      Date dataUrodzenia,
      String numerLegitymacji,
      List<Uprawnienia> uprawnienia) {
    super(login, haslo, email, imie, nazwisko, wiek, plec, dataUrodzenia);
    this.numerLegitymacji = numerLegitymacji;
    this.uprawnienia = uprawnienia;
  }
}
