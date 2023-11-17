package prak11.num2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Получаем текущую дату и время
        Date currentDate = new Date();
        System.out.println("Текущая дата и время: " + currentDate);

        // Вводим дату от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату: ");
        String userInput = scanner.nextLine();

        // Преобразуем введенную строку в объект Date
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        try {
            Date userDate = dateFormat.parse(userInput);
            System.out.println("Введенная дата и время: " + userDate);

            if (currentDate.before(userDate)) {
                System.out.println("Введенная дата находится в будущем.");
            } else if (currentDate.after(userDate)) {
                System.out.println("Введенная дата находится в прошлом.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } catch (ParseException e) {
            System.out.println("Некорректный формат даты. Пожалуйста, используйте формат (гггг-мм-дд чч:мм).");
        }
        scanner.close();
    }
}

