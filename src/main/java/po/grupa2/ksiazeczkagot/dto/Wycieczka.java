package po.grupa2.ksiazeczkagot.dto;

import java.sql.Timestamp;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wycieczka extends BaseDto<Long> {
  private Timestamp dataRozpoczecia;
  private Timestamp dataZakonczenia;
  private Boolean potwierdzona;
  private List<OdcinekWycieczki> odcinkiWycieczki;
  private Long przynaleznaOdznakaId;
  private Long potwierdzonaPrzezId;
}
