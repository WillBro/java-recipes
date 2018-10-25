package am.willi.rest.assured.listener;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

/**
 * LifeCycleLoggerListener which logs the phases of Test Execution Life Cycle
 *
 * @author William Brown
 */
@Slf4j
public class LifeCycleLoggerListener extends DependencyInjectionTestExecutionListener {

    public Logger getLogger() {
        return log;
    }

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
        getLogger().info("Running test class " + testContext.getTestClass().getName());
    }

    @Override
    public void afterTestExecution(TestContext testContext) throws Exception {
        getLogger().info("After test execution " + testContext.getTestInstance().toString());
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        getLogger().info("After test method " + testContext.getTestMethod().getName());
    }

    @Override
    public void afterTestClass(TestContext testContext) throws Exception {
        getLogger().info("After test class " + testContext.getTestClass().getName());
    }

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        getLogger().info("Before test method " + testContext.getTestMethod().getName());
    }
}