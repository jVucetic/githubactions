package com.example.unit;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tag("UnitTests")
@Slf4j
public class AppUnitTest {
    @Test
    void first_unit_test() {
        log.info("running first unit test");
    }

    @Test
    void second_unit_test() {
        log.info("running second unit test");
    }
}