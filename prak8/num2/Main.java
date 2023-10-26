package prak8.num2;
// 2. Задание от 1 до n Дано натуральное число n. Выведите все числа от 1 до n.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
