package prak11.num1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Фамилия разработчика: Петров");

        Date date = new Date();
        System.out.println("Дата и время получения задания: " + date);
        Date endDate = new Date(date.getTime() + 604800000);
        System.out.println("Дата и время сдачи задания: " + endDate);
    }
}

