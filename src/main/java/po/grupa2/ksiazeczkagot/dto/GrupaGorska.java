package po.grupa2.ksiazeczkagot.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GrupaGorska extends BaseDto<Long> {
  private String nazwa;
  private List<TerenGorski> terenyGorskie;
}
