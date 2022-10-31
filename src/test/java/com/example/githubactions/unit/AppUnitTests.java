package com.example.githubactions.unit;

import com.example.githubactions.controllers.DataController;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@AutoConfigureMockMvc
@SpringBootTest
@Tag("UnitTest")
public class AppUnitTests {
    @Autowired
    DataController dataController;

    @Test
    public void nationsLength() {
        System.out.println("unit test running");
        Integer nationsLength = dataController.getRandomNations().size();
        assertEquals(10, nationsLength);
    }

    @Test
    public void currenciesLength() {
        System.out.println("unit test running");
        Integer currenciesLength = dataController.getRandomCurrencies().size();
        assertEquals(20, currenciesLength);
    }
}
