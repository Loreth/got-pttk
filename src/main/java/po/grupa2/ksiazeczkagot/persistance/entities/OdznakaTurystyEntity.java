package po.grupa2.ksiazeczkagot.persistance.entities;

import java.sql.Date;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Data
@Entity
@Table(name = "ODZNAKA_TURYSTY")
public class OdznakaTurystyEntity extends AbstractPersistable<Long> {
  @Column(name = "DATA_ROZPOCZECIA_ZDOBYWANIA")
  private Date dataRozpoczeciaZdobywania;

  @Column(name = "DATA_ZDOBYCIA")
  private Date dataZdobycia;

  @ManyToOne
  @JoinColumn(name = "WLASCICIEL", referencedColumnName = "ID", nullable = false)
  private TurystaEntity wlasciciel;

  @ManyToOne
  @JoinColumn(name = "ODZNAKA", referencedColumnName = "ID")
  private OdznakaEntity odznaka;

  @ManyToOne
  @JoinColumn(name = "PRZYZNANA_PRZEZ", referencedColumnName = "ID")
  private PracownikRwEntity zweryfikowanaPrzez;

  @ManyToOne
  @JoinColumn(name = "ZWERYFIKOWANA_PRZEZ", referencedColumnName = "ID")
  private PrzodownikEntity przyznanaPrzez;

  @OneToMany(mappedBy = "przynaleznaOdznaka")
  private Collection<WycieczkaEntity> odbyteWycieczki;
}
