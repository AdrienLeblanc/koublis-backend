package com.koublis;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class ApplicationTest extends AbstractSpringTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() throws IOException {
        // This test will fail if the application context cannot start
        // or if there are any issues with the configuration

        extractSwagger();
    }

    private void extractSwagger() throws IOException {
        val openApiJson = restTemplate.getForObject("http://localhost:" + port + "/v3/api-docs", String.class);
        val targetDirectory = Paths.get("target", "swagger");
        Files.createDirectories(targetDirectory);
        Files.writeString(targetDirectory.resolve("swagger.json"), openApiJson);
    }
}