package po.grupa2.ksiazeczkagot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PunktZWykazu extends BaseDto<Long> {
  private Punkt punkt;
  private long terenGorskiId;
}
