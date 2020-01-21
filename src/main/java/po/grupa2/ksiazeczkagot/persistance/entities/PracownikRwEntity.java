package po.grupa2.ksiazeczkagot.persistance.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRACOWNIK_RW")
public class PracownikRwEntity extends OsobaEntity {
  @OneToOne
  @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
  private OsobaEntity osoba;
}
