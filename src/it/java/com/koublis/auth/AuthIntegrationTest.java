package com.koublis.auth;


import com.koublis.AbstractSpringIntegrationTest;
import org.junit.jupiter.api.Test;

class AuthIntegrationTest extends AbstractSpringIntegrationTest {

    @Test
    void authIT() {
        runKarate();
    }

}