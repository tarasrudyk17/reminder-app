package com.example.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.model.Reminder;
import com.example.util.UserInput;
import com.example.view.ReminderView;

public class ReminderController {
    private final List<Reminder> reminders = new ArrayList<>();
    private final ReminderView view = new ReminderView();

    public void run() {
        view.showMessage("=== Reminder App ===");
        while (true) {
            view.showMenu();
            int option = UserInput.askMenuChoice();
            switch (option) {
                case 1 -> addReminder();
                case 2 -> view.showReminders(reminders);
                case 0 -> {
                    view.showMessage("Goodbye!");
                    return;
                }
                default -> view.showMessage("Unknown option");
            }
        }
    }

    private void addReminder() {
       String text = UserInput.askText("Enter reminder text: ");

        if (text == null || text.isBlank()) {
            view.showMessage("Error: reminder text cannot be empty");
            return;
        }

        LocalDate date = UserInput.askDate("Enter date (YYYY-MM-DD): ");
        reminders.add(new Reminder(text, date));
        view.showMessage("Reminder added!");
    }
}
