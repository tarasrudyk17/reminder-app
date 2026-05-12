package com.example.util;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilsTest {

    @Test
    void parseDateShouldReturnCorrectDate() {
        LocalDate date = DateUtils.parseDate("2026-05-12");

        assertEquals(LocalDate.of(2026, 5, 12), date);
    }

    @Test
    void parseDateShouldThrowExceptionForInvalidDate() {
        assertThrows(Exception.class, () -> {
            DateUtils.parseDate("wrong-date");
        });
    }
}