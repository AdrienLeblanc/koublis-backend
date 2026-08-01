package com.koublis.roles.moderator;


import com.koublis.AbstractSpringIntegrationTest;
import org.junit.jupiter.api.Test;

class ModeratorRoleIntegrationTest extends AbstractSpringIntegrationTest {

    @Test
    void moderatorRoleSecurityIT() {
        runKarate();
    }

}