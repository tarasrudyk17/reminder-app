package com.example.model;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ReminderTest {

    @Test
    void reminderTextShouldBeCorrect() {
        Reminder reminder = new Reminder("Buy milk", LocalDate.of(2026, 5, 12));

        assertEquals("Buy bread", reminder.getText());
    }

    @Test
    void reminderDateShouldBeCorrect() {
        Reminder reminder = new Reminder("Task", LocalDate.of(2026, 1, 1));

        assertEquals(LocalDate.of(2026, 1, 1), reminder.getDate());
    }

    @Test
    void toStringShouldContainDateAndText() {
        Reminder reminder = new Reminder("Meeting", LocalDate.of(2026, 6, 1));

        assertEquals("2026-06-01: Meeting", reminder.toString());
    }
}