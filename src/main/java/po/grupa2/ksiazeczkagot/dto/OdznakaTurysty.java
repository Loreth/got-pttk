package po.grupa2.ksiazeczkagot.dto;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OdznakaTurysty extends BaseDto<Long> {
  private Date dataRozpoczeciaZdobywania;
  private Date dataZdobycia;
  private long wlascicielId;
  private Odznaka odznaka;
  private Long zweryfikowanaPrzezId;
  private Long przyznanaPrzezId;
}
