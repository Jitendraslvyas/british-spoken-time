package com.example.britishtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class BritishSpokenTimeApplication {
    private static final DateTimeFormatter FLEXIBLE_FORMATTER = DateTimeFormatter.ofPattern("H:mm");

    public static void main(String[] args) {
        BritishSpokenTimeService service = new BritishSpokenTimeService();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in 24-hour format (H:mm or HH:mm), e.g., 9:5, 09:05, 0:00, 23:59: ");
        String input = scanner.nextLine().trim();

        String[] parts = input.split(":");

        if (parts.length == 2) {
            try {
                int hour = Integer.parseInt(parts[0]);
                int minute = Integer.parseInt(parts[1]);

                if (hour == 24 && minute == 0) {
                    System.out.println("❌ 24:00 is not a valid time. Please use 00:00 for midnight.");
                    return;
                }

                String normalizedInput = String.format("%d:%02d", hour, minute);
                LocalTime time = LocalTime.parse(normalizedInput, FLEXIBLE_FORMATTER);
                String result = service.convert(time);
                System.out.println("British Spoken Time: " + result);
            } catch (NumberFormatException | DateTimeParseException e) {
                System.out.println("❌ Invalid time format. Please use H:mm or HH:mm, e.g., 9:5 or 07:30.");
            }
        } else {
            System.out.println("❌ Invalid time input. Format should be H:mm or HH:mm (e.g., 7:30, 09:15).");
        }
    }
}
