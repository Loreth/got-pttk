package po.grupa2.ksiazeczkagot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;

@SpringBootApplication(exclude = {RepositoryRestMvcAutoConfiguration.class})
public class KsiazeczkaGotApplication {

  public static void main(String[] args) {
    SpringApplication.run(KsiazeczkaGotApplication.class, args);
  }
}
