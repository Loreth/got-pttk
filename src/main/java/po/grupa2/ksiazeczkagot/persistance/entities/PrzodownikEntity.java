package po.grupa2.ksiazeczkagot.persistance.entities;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "PRZODOWNIK")
public class PrzodownikEntity extends OsobaEntity {
  @Column(name = "NUMER_LEGITYMACJI")
  private String numerLegitymacji;

  @OneToOne
  @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
  private OsobaEntity osoba;

  @OneToMany(mappedBy = "przodownik")
  private Collection<UprawnieniaEntity> uprawnienia;
}
