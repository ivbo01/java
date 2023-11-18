package prak13.num1;

public class Main {
    // 1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”. 
    public static void manipulateString(String input) {
        System.out.println(input);
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
    }

    public static void main(String[] args) {
        String str = "I like Java!!!";
        manipulateString(str);

        // 2. Распечатать последний символ строки. Используем метод String.charAt(). 
        int length = str.length();
        char lastCharacter = str.charAt(length - 1);
        System.out.println(lastCharacter);

        // 3. Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith(). 
        if (str.endsWith("!!!")) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

        // 4. Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith(). 
        if (str.startsWith("I like")) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

        // 5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains(). 
        if (str.contains("Java")) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

        // 6. Найти позицию подстроки "Java"
        System.out.println(str.indexOf("Java"));

        // 7. Заменить все символы "а" на "о"
        System.out.println(str.replace('a', 'o'));

        // 8. Преобразовать строку к верхнему регистру
        System.out.println(str.toUpperCase());

        // 9. Преобразовать строку к нижнему регистру
        System.out.println(str.toLowerCase());

        // 10. Вырезать подстроку "Java" с использованием substring()
        System.out.println(str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
    }
}
