package po.grupa2.ksiazeczkagot.persistance.entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TURYSTA")
public class TurystaEntity extends OsobaEntity {
  @OneToMany(mappedBy = "wlasciciel")
  private Collection<OdznakaTurystyEntity> odznakiTurysty;

  @ManyToOne
  @JoinColumn(name = "WYLOSOWANY_PRZEDMIOT", referencedColumnName = "ID")
  private PrzedmiotEntity wylosowanyPrzedmiot;

  @OneToOne
  @JoinColumn(name = "ZDOBYWANA_ODZNAKA", referencedColumnName = "ID")
  private OdznakaTurystyEntity zdobywanaOdznaka;
}
