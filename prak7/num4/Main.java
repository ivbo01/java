package prak7.num4;
// Разработайте интерфейс MathCalculable, который содержит объявления математических функций:
interface MathCalculable {
    double power(double num, double exponent); // возведения в степень
    double modulus(double num); // модуль комплексного числа
    double getPI(); // также содержит число PI
}
// Напишите класс MathFunc, который реализует этот интерфейс.
class MathFunc implements MathCalculable {
    @Override
    public double power(double num, double exponent) {
        return Math.pow(num, exponent);
    }

    @Override
    public double modulus(double num) {
        return Math.abs(num);
    }

    @Override
    public double getPI() {
        return Math.PI;
    }

    public double CircleLength(double radius) {
        return 2 * getPI() * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        MathFunc calculator = new MathFunc();

        double power1 = calculator.power(2, 2);
        double modulus1 = calculator.modulus(-2);
        double PI = calculator.getPI();
        double Circle1 = calculator.CircleLength(3.0);

        System.out.println(power1);
        System.out.println(modulus1);
        System.out.println(PI);
        System.out.println(Circle1);
    }
}
