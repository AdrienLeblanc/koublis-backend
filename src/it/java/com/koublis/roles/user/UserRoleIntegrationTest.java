package com.koublis.roles.user;


import com.koublis.AbstractSpringIntegrationTest;
import org.junit.jupiter.api.Test;

class UserRoleIntegrationTest extends AbstractSpringIntegrationTest {

    @Test
    void userRoleSecurityIT() {
        runKarate();
    }

}