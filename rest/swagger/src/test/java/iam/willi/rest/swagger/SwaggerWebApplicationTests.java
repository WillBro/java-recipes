package iam.willi.rest.swagger;

import am.willi.rest.swagger.SwaggerWebApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SwaggerWebApplication.class)
@WebAppConfiguration
public class SwaggerWebApplicationTests {

	@Test
	public void contextLoads() {
	}

}
