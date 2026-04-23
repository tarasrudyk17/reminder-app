package com.example.view;

import java.util.List;

import com.example.model.Reminder;

public class ReminderView {
    public void showMenu() {
        System.out.println("\n1 - Add reminder\n2 - Show reminders\n0 - Exit");
        System.out.print("Choose: ");
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }

    public void showReminders(List<Reminder> reminders) {
        if (reminders.isEmpty()) {
            System.out.println("No reminders.");
        } else {
            System.out.println("Your reminders:");
            reminders.forEach(System.out::println);
        }
    }
}
