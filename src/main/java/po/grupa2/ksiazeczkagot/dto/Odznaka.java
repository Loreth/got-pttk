package po.grupa2.ksiazeczkagot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Odznaka extends BaseDto<Long> {
  private String rodzaj;
  private String stopien;
  private int wymaganePunkty;
}
