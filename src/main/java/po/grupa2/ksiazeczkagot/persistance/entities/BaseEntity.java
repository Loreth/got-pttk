package po.grupa2.ksiazeczkagot.persistance.entities;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import lombok.EqualsAndHashCode;
import org.springframework.data.domain.Persistable;
import org.springframework.lang.Nullable;

/**
 * Klasa bazowa dla encji, odpowiednik org.springframework.data.jpa.domain.AbstractPersistable.
 * Powstała ze względu na błędną strategię generowania klucza głównego przyjmowaną przez Hibernate w
 * przypadku naszej bazy danych.
 *
 * @param <PK> Typ klucza głównego
 */
@EqualsAndHashCode
@MappedSuperclass
public abstract class BaseEntity<PK extends Serializable> implements Persistable<PK> {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private @Nullable PK id;

  @Nullable
  @Override
  public PK getId() {
    return id;
  }

  protected void setId(@Nullable PK id) {
    this.id = id;
  }

  /**
   * Must be {@link Transient} in order to ensure that no JPA provider complains because of a
   * missing setter.
   */
  @Transient // DATAJPA-622
  @Override
  public boolean isNew() {
    return null == getId();
  }

  @Override
  public String toString() {
    return String.format("Entity of type %s with id: %s", this.getClass().getName(), getId());
  }
}
