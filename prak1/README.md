### Задания на практическую работу No 1
1. Создать проект в IntelliJ IDEA
2. Создать свой собственный Git репозитарий
3. Написать программу, в результате которой массив чисел создается с помощью инициализации (как в Си) вводится и считается в цикле сумма элементов целочисленного массива, а также среднее арифметическое его элементов результат выводится на экран. Использовать цикл for.
```java
public class Main {
    public static void main(String args[]) {
        int[] array = {1, 2, 3};
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }
        System.out.println(summ);
        System.out.println(summ/array.length);

    }
}
```

4. Написать программу, в результате которой массив чисел вводится пользователем с клавиатуры считается сумма элементов целочисленного массива с помощью циклов do while, while, также необходимо найти максимальный и минимальный элемент в массиве, результат выводится на экран.
```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.IntSummaryStatistics;

public class Main {
    public static void main(String args[]) {
        System.out.print("Введите длину массива: ");
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt(); /* считывает целое число из потока ввода*/
        }
        
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        System.out.println("Минимальный символ: " + min);
        System.out.println("Максимальный символ: " + max);
    }
}
```

5. Написать программу, в результате которой выводятся на экран аргументы командной строки в цикле for.

```java
public class Main {
    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
```

6. Написать программу, в результате работы которой выводятся на экран первые 10 чисел гармонического ряда (форматировать вывод).

```java
public class Main {
    public static void main(String args[]) {
        double denominator = 0;
        for (int i = 0; i < 10; i++) {
            denominator++;
            double harmonic = 1 / denominator;
            System.out.println(harmonic);
        }
    }
}
```

7. Написать программу, которая с помощью метода класса, вычисляет факториал числа (использовать управляющую конструкцию цикла), проверить
работу метода.

```java
import java.util.Scanner;

public class Main {
    public static int fact(int f){
        int factorial_result = 1; 
        for (int i = 1; i <= f; i++) {
            factorial_result *= i;
        }
        return factorial_result;
    }   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = sc.nextInt();
        System.out.println(fact(i));
    }
}
```

8. Результаты выполнения практической работы залить через IDE в свой репозитарий и продемонстрировать преподавателю.
