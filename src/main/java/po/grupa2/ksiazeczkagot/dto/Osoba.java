package po.grupa2.ksiazeczkagot.dto;

import java.sql.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Osoba extends Uzytkownik {
  private String imie;
  private String nazwisko;
  private Integer wiek;
  private String plec;
  private Date dataUrodzenia;

  public Osoba(
      String login,
      String haslo,
      String email,
      String imie,
      String nazwisko,
      Integer wiek,
      String plec,
      Date dataUrodzenia) {
    super(login, haslo, email);
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
    this.plec = plec;
    this.dataUrodzenia = dataUrodzenia;
  }
}
