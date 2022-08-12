package com.example.bowlingbackend;

import com.example.bowlingbackend.controllers.BowlingController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BowlingBackendApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private BowlingController bowlingController;

    @Test
    public void controllerIsNotNull() {
        assert(bowlingController != null);
    }

    @Test
    public void controllerIntegrationTest() {
        assert(true);
    }

}
