package po.grupa2.ksiazeczkagot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OdcinekWycieczki extends BaseDto<Long> {
  private Integer punktacja;
  private Boolean punktowany;
  private Integer odleglosc;
  private Integer przewyzszenie;
  private Punkt punktPoczatkowy;
  private Punkt punktKoncowy;
  private long wycieczkaId;
}
