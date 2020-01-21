package po.grupa2.ksiazeczkagot.service.implementation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.BDDMockito.given;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import po.grupa2.ksiazeczkagot.dto.Przedmiot;
import po.grupa2.ksiazeczkagot.persistance.entities.PrzedmiotEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.PrzedmiotRepository;
import po.grupa2.ksiazeczkagot.service.mapper.PrzedmiotMapper;

@SpringBootTest
class PrzedmiotServiceImplTest {
  @Autowired PrzedmiotServiceImpl przedmiotService;
  @Autowired PrzedmiotMapper przedmiotMapper;
  @MockBean PrzedmiotRepository przedmiotRepository;

  @Test
  void givenPositiveAmount_WhenDrawRandomItems_ThenReturnThatAmount() {
    // given
    List<PrzedmiotEntity> itemEntities =
        List.of(
            new PrzedmiotEntity("przedmiot1", "link1"),
            new PrzedmiotEntity("przedmiot2", "link2"),
            new PrzedmiotEntity("przedmiot3", "link3"),
            new PrzedmiotEntity("przedmiot4", "link4"));
    List<Przedmiot> itemDtos = przedmiotMapper.mapToDtoList(itemEntities);

    given(przedmiotRepository.findAll()).willReturn(itemEntities);

    // when
    List<Przedmiot> randomItems = przedmiotService.drawRandomItems(2);
    // then
    assertThat(itemDtos).containsAll(randomItems);
  }

  @Test
  void givenNegativeAmount_WhenDrawRandomItems_ThenThrowIllegalArgumentException() {
    // given
    List<PrzedmiotEntity> itemEntities =
        List.of(
            new PrzedmiotEntity("przedmiot1", "link1"),
            new PrzedmiotEntity("przedmiot2", "link2"),
            new PrzedmiotEntity("przedmiot3", "link3"));

    given(przedmiotRepository.findAll()).willReturn(itemEntities);

    // when & then
    assertThatThrownBy(() -> przedmiotService.drawRandomItems(-5))
        .isInstanceOf(IllegalArgumentException.class);
  }

  @Test
  void givenZeroAmount_WhenDrawRandomItems_ThenReturnNoItems() {
    // given
    List<PrzedmiotEntity> itemEntities =
        List.of(
            new PrzedmiotEntity("przedmiot1", "link1"),
            new PrzedmiotEntity("przedmiot2", "link2"),
            new PrzedmiotEntity("przedmiot3", "link3"));

    given(przedmiotRepository.findAll()).willReturn(itemEntities);

    // when
    List<Przedmiot> randomItems = przedmiotService.drawRandomItems(0);
    // then
    assertThat(randomItems).isEmpty();
  }
}
