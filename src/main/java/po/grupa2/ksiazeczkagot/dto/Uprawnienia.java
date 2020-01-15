package po.grupa2.ksiazeczkagot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Uprawnienia extends BaseDto<Long> {
  private long przodownikId;
  private long grupaGorskaId;
}
