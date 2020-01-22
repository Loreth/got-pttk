package po.grupa2.ksiazeczkagot.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(value = ItemPhotoRestController.class)
class ItemPhotoRestControllerTest {
  @Autowired private MockMvc mockMvc;
  @Autowired private ObjectMapper objectMapper;

  @Test
  void givenExistingPngPhotoFilename_WhenHandlePhotoDownload_ThenReturnThatPhoto()
      throws Exception {
    // given
    String filename = "widelec.png";

    // when & then
    mockMvc
        .perform(get(RestMappings.ITEM_PHOTO + "/" + filename))
        .andExpect(status().isOk())
        .andExpect(content().contentType(MediaType.IMAGE_PNG))
        .andExpect(
            content()
                .bytes(
                    new ClassPathResource("/item_photos/" + filename)
                        .getInputStream()
                        .readAllBytes()));
  }
}
