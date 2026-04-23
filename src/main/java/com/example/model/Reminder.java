package com.example.model;

import java.time.LocalDate;

public class Reminder {
    private final String text;
    private final LocalDate date;

    public Reminder(String text, LocalDate date) {
        this.text = text;
        this.date = date;
    }

    public String getText() { return text; }
    public LocalDate getDate() { return date; }

    @Override
    public String toString() {
        return date + ": " + text;
    }
}