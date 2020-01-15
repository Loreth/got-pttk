package po.grupa2.ksiazeczkagot.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"id"})
public abstract class BaseDto<ID> {
  private ID id;
}
