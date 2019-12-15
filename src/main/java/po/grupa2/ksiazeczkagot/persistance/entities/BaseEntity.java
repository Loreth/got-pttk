package po.grupa2.ksiazeczkagot.persistance.entities;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
@Data
public abstract class BaseEntity<ID extends Serializable> {

    @Id
    @GeneratedValue
    protected ID id;
}
