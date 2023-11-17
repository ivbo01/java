package prak13.num1_6;

public class Main {
    public static void main(String[] args) {
        String str = "I like Java!!!";

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
