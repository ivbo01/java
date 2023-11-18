package prak14.num1;
// 1, Необходимо реализовать консольное приложение,
// позволяющее манипулировать строкой, разбив ее на элементы путем использования регулярных выражений. 
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        while (true) {
            System.out.println("1. Разбить строку на слова");
            System.out.println("2. Извлечь числа из строки");
            System.out.println("3. Заменить пробелы на подчеркивания");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    splitFun(input);
                    break;
                case 2:
                    numFun(input);
                    break;
                case 3:
                    spaceFun(input);
                    break;
                default:
                    System.out.println("Программа завершена.");
                    scanner.close();
                    System.exit(0);
            }
        }
    }

    private static void splitFun(String input) {
        String[] words = input.split("\\s+");
        for (String i: words) {
            System.out.println(i);
        }
    }

    private static void numFun(String input) {
        Pattern digit = Pattern.compile("\\d+");
        Matcher matcher = digit.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private static void spaceFun(String input) {
        String space = input.replaceAll("\\s", "_");
        System.out.println(space);
    }
}

