package prak3.num1;

public class Main {
    public static void main(String[] args) {
        // 1. Создайте объекты класса Double, используя методы valueOf().
        Double x = Double.valueOf("100"); // Double не примитивный тип (не путать с double)
        System.out.println("x = " + x);
        // 2. Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
        double y = Double.parseDouble("100");
        System.out.println("y = " + y);
        // 3. Преобразовать объект класса Double ко всем примитивным типам.
        String str1 = "123.0000000001";
        Double z = Double.parseDouble(str1);
        byte z_bite = z.byteValue();
        short z_short = z.shortValue();
        int z_int = z.intValue();
        long z_long = z.longValue();
        float z_float = z.floatValue();
        double z_double = z.doubleValue();
        char z_char = (char)(z.doubleValue());
        boolean z_boolean = z.doubleValue() != 0.0;
        // 4. Вывести значение объекта Double на консоль.
        System.out.println("z_bite = " + z_bite);
        System.out.println("z_short = " + z_short);
        System.out.println("z_int = " + z_int);
        System.out.println("z_long = " + z_long);
        System.out.println("z_float = " + z_float);
        System.out.println("z_double = " + z_double);
        System.out.println("z_char = " + z_char);
        System.out.println("z_boolean = " + z_boolean);
    }
}
