package cloud.poesis.sis.sourcer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot entry point for the SIS Code Sourcer.
 *
 * <p>Client process that turns a code repository into GSM contributions posted to a Definition
 * Blackboard. Hosts the four packages defined in {@code def/components.puml}: KS contract,
 * Services, KSs, and a Blackboard-facing client.
 */
@OpenAPIDefinition(
    info =
        @Info(
            title = "SIS Code Sourcer API",
            version = "v1",
            description =
                "Control-plane API for the SIS Code Sourcer. The sourcer posts"
                    + " confidence-bearing contributions to a Definition Blackboard via REST."))
@SpringBootApplication
public class SourcerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SourcerApplication.class, args);
  }
}
