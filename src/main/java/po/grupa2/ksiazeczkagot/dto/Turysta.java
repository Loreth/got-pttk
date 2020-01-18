package po.grupa2.ksiazeczkagot.dto;

import java.sql.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Turysta extends Osoba {

  private Przedmiot wylosowanyPrzedmiot;
  private Long zdobywanaOdznakaId;

  public Turysta(
      String login,
      String haslo,
      String email,
      String imie,
      String nazwisko,
      Integer wiek,
      String plec,
      Date dataUrodzenia,
      Przedmiot wylosowanyPrzedmiot,
      Long zdobywanaOdznakaId) {
    super(login, haslo, email, imie, nazwisko, wiek, plec, dataUrodzenia);
    this.wylosowanyPrzedmiot = wylosowanyPrzedmiot;
    this.zdobywanaOdznakaId = zdobywanaOdznakaId;
  }
}
