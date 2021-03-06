package po.grupa2.ksiazeczkagot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PunktZWykazu extends BaseDto<Long> {
  private String nazwa;
  private Integer wysokosc;
  private Wspolrzedna szerokoscGeograficzna;
  private Wspolrzedna dlugoscGeograficzna;
  private long terenGorskiId;
}
