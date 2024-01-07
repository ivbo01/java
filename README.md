Задания: https://drive.google.com/drive/folders/10fp-olO1h52YLS_g2xr3vcRszgL9Sf0j
<br>
Список заданий: https://docs.google.com/spreadsheets/d/17P4XbeMGqjjmKQoFFItS05aNuMGcOu_iEsN5EdPHYu4
<br>
Список: https://docs.google.com/spreadsheets/d/1XOUp-YLH3GhE9tt7ZoCSyO8RG3OGjF7Zx84h8rc2Ehk

### .\ivc116-117
### 67

### Листинг 1.1 Пример объявления класса
```java
public class Main { // файл Main.java
    public static void main(String[] args) {
    }
}
```
### Листинг 1.2 Пример присваивания значений переменным
```java
public class Main {
    public static void main(String[] args) {
        float length = 2.5f;
        double radius = 10024.5;
        int meanOfLife = 42;
        Object object = new String("Hello, world!");
        String b = "Once compiled, runs everywhere?";
        System.out.println(length);
    }
}
```

### do while
```java
public class Main {
    public static void main(String[] args) {
        int a = 2;
        do {
            System.out.println("a = " + a);
            a = a + 1;
        }
        while(a > 3); // дальше цикл выполняться не будет
    }
}
```

### Массивы в Джава
```java
public class Main {
    public static void main(String[] args) {
        int[] a = new int[10]; // Инициализация массива по умолчанию
        int[] b = new int[] {5, 3, 5, 3, 4, 4, 3, 2, 5, 4}; // Инициализация массива на этапе объявления
        b[0] = 2;
        System.out.println(b[0]); // Доступ к элементам массива
        System.out.println(b.length);
    }
}
```

### Листинг 1.3 – Пример чтения данных ввода с клавиатуры
```java
import java.util.Scanner; // импортируем класс
import java.util.Scanner; // импортируем класс
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 2;
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) {
            /* hasNextInt() возвращает истинну если с потока ввода можно считать целое число*/
            i = sc.nextInt(); /* считывает целое число из потока ввода и сохраняет в переменную i*/
            System.out.println(i * 2);
        }
        else {
            System.out.println("Вы ввели не целое число!");
        }
    }
}
```

### Листинг 1.4 – Пример чтения строк и их конкатенации
```java
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String s1,s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(s1 + s2);
    }
}
```

### Листинг 1.5 – Пример работы с методами String
```java
public class Main {
    public static void main(String[] args) {
        String s1 = "firefox";
        System.out.println(s1.toLowerCase()); // все символы строчными
        System.out.println(s1.toUpperCase()); // все символы прописным
        String s2 = s1.replace('o', 'a');
        System.out.println(s2); // выведет «firefax»
        System.out.println(s2.charAt(1)); // выведет «i»
        System.out.println("----------");
        int i;
        i = s1.length(); // длина строки
        System.out.println(i);
        i = s1.indexOf('f'); // индекс символа
        System.out.println(i);
        i = s1.indexOf('r');
        System.out.println(i);
        i = s1.lastIndexOf('f'); // индекс последнего символа
        System.out.println(i);
        i = s1.indexOf('t'); // индекс не найден (-1)
        System.out.println(i);
        i = s1.indexOf('r', 3); // индекс ищется с 4 символа, не найден (-1)
        System.out.println(i);
    }
}
```

### Листинг 1.6 – Пример работы со строками
```java
// вывод на экран индексов пробелов в строке
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new
        Scanner(System.in);
        String s =sc.nextLine();
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
            System.out.println(i);
            }
        }
    }
}
```

### Методы в языке Java
```java
public class Main {
    public static int sum(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        int s = sum(10, 15);
        System.out.println(s);
    }

}
```
