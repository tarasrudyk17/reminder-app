package com.example;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

class E2ETest {

    @Test
    void applicationShouldRunWithoutCrashing() {
        String input = """
                1
                Buy milk
                2026-05-12
                0
                """;

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}