package po.grupa2.ksiazeczkagot.controller;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import po.grupa2.ksiazeczkagot.dto.OdcinekWycieczki;
import po.grupa2.ksiazeczkagot.dto.Punkt;
import po.grupa2.ksiazeczkagot.service.OdcinekWycieczkiService;

@WebMvcTest(value = OdcinekWycieczkiRestController.class)
class OdcinekWycieczkiRestControllerTest {
  @Autowired private MockMvc mockMvc;
  @MockBean private OdcinekWycieczkiService service;
  @Autowired private ObjectMapper objectMapper;

  @Test
  void givenExistingEntity_WhenGet_ThenReturnThatEntity() throws Exception {
    long id = 1;
    OdcinekWycieczki odcinekWycieczki =
        new OdcinekWycieczki(
            5,
            false,
            1500,
            400,
            new Punkt("punkt1", 0, null, null),
            new Punkt("punkt1", 0, null, null),
            1);

    // given
    given(service.findById(id)).willReturn(Optional.of(odcinekWycieczki));

    // when & then
    mockMvc
        .perform(get(RestMappings.ODCINEK_WYCIECZKI + "/1"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(content().json(objectMapper.writeValueAsString(odcinekWycieczki)));
  }
}
