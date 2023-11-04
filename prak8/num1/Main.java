package prak8.num1;
// 1. Задание Треугольная последовательность
// Дана монотонная последовательность, в которой каждое натуральное число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,...
// По данному натуральному n выведите первые n членов этой последовательности. Попробуйте обойтись только одним циклом for.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Сколько чисел мы должны вывести
        int k = 1; // Текущее число k

        for (int i = 1; i <= n; ) {
            for (int j = 1; j <= k; j++) {
                if (i <= n) {
                    System.out.print(k + " "); // Вывод текущего числа
                    i++; // Увеличение счетчика выведенных чисел
                } else {
                    break; // Выход из внутреннего цикла, если уже выведено n чисел
                }
            }

            k++;
        }
        sc.close();
    }
}
