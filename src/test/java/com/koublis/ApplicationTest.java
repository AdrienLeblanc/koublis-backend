package com.koublis;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestClient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTest extends AbstractSpringTest {

    @LocalServerPort
    private int port;

    @Test
    void contextLoads() throws IOException {
        // This test will fail if the application context cannot start
        // or if there are any issues with the configuration

        extractSwagger();
    }

    private void extractSwagger() throws IOException {
        val openApiJson = RestClient.create()
                .get()
                .uri("http://localhost:" + port + "/v3/api-docs")
                .retrieve()
                .body(String.class);
        assertThat(openApiJson).isNotNull();

        val targetDirectory = Paths.get("target", "swagger");
        Files.createDirectories(targetDirectory);
        val swaggerFile = targetDirectory.resolve("swagger.json");
        Files.writeString(swaggerFile, openApiJson);

        assertThat(swaggerFile.toFile()).exists();
    }
}