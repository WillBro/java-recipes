package am.willi.rest.assured;

import am.willi.rest.assured.listener.LifeCycleLoggerListener;
import io.restassured.RestAssured;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import static io.restassured.RestAssured.when;

@ContextConfiguration(classes = {TestApplication.class})
@TestExecutionListeners(
        listeners = {LifeCycleLoggerListener.class},
        mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS
)
@RunWith(JUnitPlatform.class)
@Slf4j
public class RequestGoogleTest {

    @Before
    public void beforeTest() {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }

    @Test
    public void testGetGoogleHomepageReturnsSuccessResponseCode() {
        when()
                .get("https://www.google.com/")
                .then()
                .log().headers()
                .assertThat()
                .statusCode(200);
    }
}
