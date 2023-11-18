package prak14.num2;
// 2. Написать регулярное выражение, определяющее является ли данная строка строкой "abcdefghijklmnopqrstuv18340" или нет. 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str1 = "abcdefghijklmnopqrstuv18340"; // пример правильных выражений: abcdefghijklmnopqrstuv18340 
        String str2 = "abcdefghijklmnoasdfasdpqrstuv18340"; // пример неправильных выражений: abcdefghijklmnoasdfasdpqrstuv18340
        String regex = "^abcdefghijklmnopqrstuv18340$";

        System.out.println(isValid(str1, regex));
        System.out.println(isValid(str2, regex));
    }

    private static boolean isValid(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
