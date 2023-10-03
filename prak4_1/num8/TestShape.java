package prak4_1.num8;

public class TestShape {
    public static void main(String[] args) {

        Shape Circle1 = new Circle("red", true, 10); // Создаем объект Circle и сохраняем ссылку в массиве
        Shape Rectangle1 = new Rectangle("black", true, 2, 3); // Создаем объект Rectangle и сохраняем ссылку в массиве
        Shape Square1 = new Square(2, "red", false); // Создаем объект Square и сохраняем ссылку в массиве

        System.out.println("Класс: " + Circle1.getClass());
        System.out.println("Цвет: " + Circle1.getColor());
        System.out.println("Залито цветом: " + Circle1.isFilled());
        System.out.println("Периметр: " + Circle1.getPerimeter());
        System.out.println("Площадь: " + Circle1.getArea());
        System.out.println();
        System.out.println("Класс: " + Rectangle1.getClass());
        System.out.println("Цвет: " + Rectangle1.getColor());
        System.out.println("Залито цветом: " + Rectangle1.isFilled());
        System.out.println("Периметр: " + Rectangle1.getPerimeter());
        System.out.println("Площадь: " + Rectangle1.getArea());
        System.out.println();
        System.out.println("Класс: " + Square1.getClass());
        System.out.println("Цвет: " + Square1.getColor());
        System.out.println("Залито цветом: " + Square1.isFilled());
        System.out.println("Периметр: " + Square1.getPerimeter());
        System.out.println("Площадь: " + Square1.getArea());
    }
}
