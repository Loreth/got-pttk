package po.grupa2.ksiazeczkagot.persistance.entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TURYSTA")
public class TurystaEntity extends OsobaEntity {
  @OneToMany(mappedBy = "wlasciciel")
  private Collection<OdznakaTurystyEntity> odznakiTurysty;

  @OneToOne
  @JoinColumn(name = "ID", referencedColumnName = "ID", nullable = false)
  private OsobaEntity osoba;

  @ManyToOne
  @JoinColumn(name = "WYLOSOWANY_PRZEDMIOT", referencedColumnName = "ID")
  private PrzedmiotEntity wylosowanyPrzedmiot;
}
