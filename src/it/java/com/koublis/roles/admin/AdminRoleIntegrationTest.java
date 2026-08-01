package com.koublis.roles.admin;


import com.koublis.AbstractSpringIntegrationTest;
import org.junit.jupiter.api.Test;

class AdminRoleIntegrationTest extends AbstractSpringIntegrationTest {

    @Test
    void adminRoleSecurityIT() {
        runKarate();
    }

}