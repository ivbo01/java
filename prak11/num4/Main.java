package prak11.num4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год (yyyy): ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (MM): ");
        int month = scanner.nextInt();

        System.out.print("Введите день (dd): ");
        int day = scanner.nextInt();

        System.out.print("Введите часы (HH): ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты (mm): ");
        int minutes = scanner.nextInt();

        Date date = createDate(year, month, day, hours, minutes);
        Calendar calendar = createCalendar(year, month, day, hours, minutes);

        System.out.println("Созданный объект Date: " + date);
        System.out.println("Созданный объект Calendar: " + calendar.getTime());
        scanner.close();
    }

    private static Date createDate(int year, int month, int day, int hours, int minutes) {
        try {
            String dateString = String.format("%04d-%02d-%02d %02d:%02d", year, month, day, hours, minutes);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Некорректный формат даты.");
            return null;
        }
    }

    private static Calendar createCalendar(int year, int month, int day, int hours, int minutes) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes);
        return calendar;
    }
}
