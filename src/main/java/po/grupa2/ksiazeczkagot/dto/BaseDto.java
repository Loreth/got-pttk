package po.grupa2.ksiazeczkagot.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.Null;
import lombok.Data;
import po.grupa2.ksiazeczkagot.validation.groups.OnCreate;

@Data
@JsonPropertyOrder({"id"})
public abstract class BaseDto<ID> {
  @Null(groups = {OnCreate.class})
  private ID id;
}
