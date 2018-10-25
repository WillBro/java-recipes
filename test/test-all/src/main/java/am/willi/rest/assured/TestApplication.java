package am.willi.rest.assured;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {
        "am.willi.rest.assured"
})
public class TestApplication {

    public void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}