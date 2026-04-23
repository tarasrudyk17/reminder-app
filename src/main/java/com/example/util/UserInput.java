package com.example.util;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int askMenuChoice() {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static String askText(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static LocalDate askDate(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        return DateUtils.parseDate(input);
    }
}
