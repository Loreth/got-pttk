package po.grupa2.ksiazeczkagot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Przedmiot extends BaseDto<Long> {
  private String nazwa;
  private String obrazekUrl;
}
