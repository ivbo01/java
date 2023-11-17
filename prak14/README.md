### Пример использования классов Pattern и Matcher
```java
import java.util.regex.*;

public class DemoRegular {
    public static void main(String[] args) {
        // Проверка на соответствие строки шаблону
        Pattern p1 = Pattern.compile("a*y");
        Matcher m1 = p1.matcher("aaay");
        boolean b = m1.matches();
        System.out.println(b);

        // Поиск и выбор подстроки, заданной шаблоном
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";
        String s = "адреса эл.почты: mymail@tut.by и rom@bsu.by";
        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());
        }

        // Разбиение строки на подстроки с применением шаблона в качестве разделителя
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java5tiger 77 java6mustang");
        for (String word : words)
            System.out.println(word);
    }
}
```

```java
true 
e - mail : mymail @ tut. by 
e-mail: rom@bsu.by 
java 
tiger 
java 
mustang
```

```java
import java.util.regex.*;

public class Groups {
    public static void main(String[] args) {
        String input = "abdcxyz";

        // Первая группа содержит любое количество букв, вторая - одну или более букв
        myMatches("([a-z]*)([a-z]+)", input);

        // Первая группа содержит ноль или одну букву, вторая - одну или более букв
        myMatches("([a-z]?)([a-z]+)", input);

        // Первая группа содержит одну или более букв, вторая - ноль или более букв
        myMatches("([a-z]+)([a-z]*)", input);
    }

    // Функция для выполнения поиска с использованием заданного регулярного выражения
    private static void myMatches(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Проверка на совпадение и вывод результатов
        if (matcher.matches()) {
            System.out.println("Input: " + input);
            System.out.println("Group 1: " + matcher.group(1));
            System.out.println("Group 2: " + matcher.group(2));
            System.out.println();
        } else {
            System.out.println("No match found.");
        }
    }
}
```

```java
First group: abdcxy 
Second group: z 
First group: a 
Second group: bdcxyz 
First group: abdcxyz 
Second group: nothing
```

### Класс StringTokenizer
```java
import java.util.StringTokenizer;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Test test = new Test();

        // Строка для разбора на токены
        String toParse = "word1;word2;word3;word4";

        // Использование StringTokenizer для разбиения строки на токены с разделителем ";"
        StringTokenizer st = new StringTokenizer(toParse, ";");

        // Перебор и вывод токенов
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
```