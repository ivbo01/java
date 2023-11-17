package prak13.num1_1;

public class Main {
    public static void manipulateString(String input) {
        System.out.println(input);
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
    }

    public static void main(String[] args) {
        String exampleString = "I like Java!!!";
        manipulateString(exampleString);
    }
}
