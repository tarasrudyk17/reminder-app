package com.example.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
    public static LocalDate parseDate(String input) {
        return LocalDate.parse(input, DateTimeFormatter.ISO_LOCAL_DATE);
    }
}