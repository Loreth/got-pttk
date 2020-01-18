package po.grupa2.ksiazeczkagot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Wspolrzedna extends BaseDto<Long> {
  private int stopnie;
  private int minuty;
  private double sekundy;
}
