package po.grupa2.ksiazeczkagot.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RestMappings.ITEM_PHOTO)
public class ItemPhotoController {

  @GetMapping(RestMappings.FILE_NAME)
  public ResponseEntity<Resource> handlePhotoDownload(@PathVariable String fileName) {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.IMAGE_PNG);
    Resource resource = new ClassPathResource("/item_photos/" + fileName);

    return new ResponseEntity<>(resource, headers, HttpStatus.OK);
  }
}
