package po.grupa2.ksiazeczkagot.service.implementation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import po.grupa2.ksiazeczkagot.dto.Uzytkownik;
import po.grupa2.ksiazeczkagot.persistance.entities.UzytkownikEntity;
import po.grupa2.ksiazeczkagot.persistance.repositories.UzytkownikRepository;
import po.grupa2.ksiazeczkagot.service.mapper.UzytkownikMapper;

@SpringBootTest
class UzytkownikServiceImplTest {

  @Autowired UzytkownikServiceImpl uzytkownikService;
  @Autowired UzytkownikMapper uzytkownikMapper;
  @MockBean UzytkownikRepository uzytkownikRepository;

  @Test
  void givenUpdatedDtoAndCorrectId_WhenUpdateById_ThenUpdateEntityAndReturnUpdatedDto() {
    // given
    UzytkownikEntity userEntity = new UzytkownikEntity("login", "Haslo123", "email@email.com");

    Uzytkownik updatedUserDto = new Uzytkownik("login", "Nowehaslo321", "email@email.com");
    updatedUserDto.setId(1L);

    UzytkownikEntity updatedUserEntity = uzytkownikMapper.mapToEntity(updatedUserDto);

    given(uzytkownikRepository.findById(any())).willReturn(Optional.of(userEntity));
    given(uzytkownikRepository.save(updatedUserEntity))
        .will(
            invocation -> {
              userEntity.setHaslo(updatedUserDto.getHaslo());
              userEntity.setEmail(updatedUserDto.getEmail());

              return userEntity;
            });

    // when & then
    assertThat(uzytkownikService.updateById(updatedUserDto, 1L))
        .satisfies(uzytkownik -> assertThat(uzytkownik.get().getHaslo()).isEqualTo("Nowehaslo321"));
    assertThat(userEntity.getHaslo()).isEqualTo("Nowehaslo321");
  }
}
