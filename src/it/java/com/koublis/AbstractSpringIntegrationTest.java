package com.koublis;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("it")
public abstract class AbstractSpringIntegrationTest extends AbstractTestContainersTest {

    @LocalServerPort
    protected String localServerPort;

    @BeforeEach
    void setUp() {
        System.setProperty("karate.server.port", String.valueOf(localServerPort));
    }

    /**
     * Runs every Karate feature located in the concrete test class' package and fails
     * the test if any scenario failed.
     * <p>
     * Karate's {@code @Karate.Test} JUnit 5 integration is built against the JUnit 5
     * Platform and is not discovered under the JUnit 6 Platform managed by Spring Boot 4,
     * so we drive Karate through its programmatic {@link Runner} API from a plain JUnit test.
     */
    protected void runKarate() {
        Results results = Runner.builder()
                .relativeTo(getClass())
                .path("classpath:" + getClass().getPackageName().replace('.', '/'))
                .parallel(1);
        assertThat(results.getFailCount())
                .as(results.getErrorMessages())
                .isZero();
    }
}
