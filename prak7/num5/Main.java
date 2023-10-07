package prak7.num5;
// Разработайте интерфейс для работы со строками, который содержит
interface InterStr {
    int countStr(String string); // функции подсчета символов в строке
    String OddStr(String string); // функция возвращает строку, состоящую из символов, которые размещены на нечетных позициях
    String reverseStr(String string); // функцию инвертирования строки
}

class ClassStr implements InterStr {
    @Override
    public int countStr(String string) {
        return string.length();
    }

    @Override
    public String OddStr(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i += 2) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseStr(String string) {
        StringBuilder result = new StringBuilder(string);
        return result.reverse().toString();
    }
}

public class Main {
    public static void main(String[] args) {
        InterStr EditStr = new ClassStr();

        String str1 = "Hello, World!";

        System.out.println("Количество символов в строке: " + EditStr.countStr(str1));
        System.out.println("Символы на нечетных позициях: " + EditStr.OddStr(str1));
        System.out.println("Инвертированная строка: " + EditStr.reverseStr(str1));
    }
}
