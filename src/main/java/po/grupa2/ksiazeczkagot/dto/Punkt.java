package po.grupa2.ksiazeczkagot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Punkt extends BaseDto<Long> {
  private String nazwa;
  private int wysokosc;
  private Wspolrzedna szerokoscGeograficzna;
  private Wspolrzedna dlugoscGeograficzna;
}