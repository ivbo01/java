package prak8.num5;

public class Main {
    public static int sumOfDigits(int N) {
        if (N < 10) {
            return N;
        }

        return sumOfDigits(N / 10) + N % 10;
    }

    public static void main(String[] args) {
        int N = 123456789;
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + ": " + sum);
    }
}
