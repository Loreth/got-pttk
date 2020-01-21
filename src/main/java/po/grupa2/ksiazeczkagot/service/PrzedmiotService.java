package po.grupa2.ksiazeczkagot.service;

import java.util.List;
import po.grupa2.ksiazeczkagot.dto.Przedmiot;

public interface PrzedmiotService extends CrudService<Przedmiot, Long> {
  List<Przedmiot> drawRandomItems(int amount);
}
