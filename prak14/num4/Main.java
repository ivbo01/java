package prak14.num4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Здесь представлены правильные выражения (1 + 8) - 9 / 4, а здесь неправильные 6 / 5 - 2 * 9";

        String regex = "\\b\\d(?!\\s*\\+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}