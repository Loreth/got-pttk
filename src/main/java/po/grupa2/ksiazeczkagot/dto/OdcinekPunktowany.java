package po.grupa2.ksiazeczkagot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OdcinekPunktowany extends BaseDto<Long> {
  private int punktacja;
  private Integer odleglosc;
  private PunktZWykazu punktPoczatkowy;
  private PunktZWykazu punktKoncowy;
}
