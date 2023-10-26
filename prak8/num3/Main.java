package prak8.num3;
// 3. Задание от A до B Даны два целых числа A и В (каждое в отдельной строке).
// Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); 
        int B = sc.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) { 
                System.out.println(i);
            }
        } else { // Если A больше B
            for (int i = A; i >= B; i--) { // Вывод чисел от A до B включительно в обратном порядке
                System.out.println(i);
            }
        }
        sc.close();
    }
}
