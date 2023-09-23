Класс Java Math имеет множество методов, которые позволяют решать на Джава математические задачи.

```java
public class Main {
    public static void main(String[] args) {
        double x = 28;
        double y = 4;
        // вернет maximum из двух чисел
        System.out.println("Maximum number of x and y is:" + Math.max(x, y));
        // вернет квадратный корень из y
        System.out.println("Square root of y is: " + Math.sqrt(y));
        //вергнет 28 в четвертой степени 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));
        // вернет логарифм заданного значения
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));
        // вернет логарифм из десяти по основанию 10
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));
        // вернет log из x + 1
        System.out.println("log1p of x is: " + Math.log1p(x));
        /* Метод Math.exp() — возвращает натуральный
        логарифм по основанию e и аргументу — показателю
        степени, где e — иррациональная константа, равная
        приблизительно 2,71828182 */
        System.out.println("exp of a is: " +Math.exp(x));
        System.out.println("expm1 of a is: " + Math.expm1(x));
    }
}
```