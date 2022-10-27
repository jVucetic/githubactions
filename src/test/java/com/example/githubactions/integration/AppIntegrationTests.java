package com.example.githubactions.integration;

import com.example.githubactions.controllers.DataController;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AutoConfigureMockMvc
@SpringBootTest
@Tag("IntegrationTest")
public class AppIntegrationTests {
    @Autowired
    public MockMvc mockMvc;
    @Autowired
    DataController dataController;

    @Test
    public void health() {
        System.out.println("first integration test running");
        assertEquals( "HEALTH CHECK OK!", dataController.healthCheck());
    }

    @Test
    public void version() {
        System.out.println("second integration test running");
        assertEquals( "The actual version is 1.0.0", dataController.version());
    }

}
