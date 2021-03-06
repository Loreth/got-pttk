package po.grupa2.ksiazeczkagot.persistance.entities;

import java.sql.Timestamp;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "WYCIECZKA")
public class WycieczkaEntity extends BaseEntity<Long> {
  @Column(name = "DATA_ROZPOCZECIA")
  private Timestamp dataRozpoczecia;

  @Column(name = "DATA_ZAKONCZENIA")
  private Timestamp dataZakonczenia;

  private Boolean potwierdzona;

  @OneToMany(mappedBy = "wycieczka", cascade = CascadeType.ALL)
  private Collection<OdcinekWycieczkiEntity> odcinkiWycieczki;

  @ManyToOne
  @JoinColumn(name = "PRZYNALEZNA_ODZNAKA", referencedColumnName = "ID", nullable = false)
  private OdznakaTurystyEntity przynaleznaOdznaka;

  @ManyToOne
  @JoinColumn(name = "POTWIERDZONA_PRZEZ", referencedColumnName = "ID")
  private PrzodownikEntity potwierdzonaPrzez;
}
