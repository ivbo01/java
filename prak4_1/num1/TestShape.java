public class TestShape {
    public static void main(String[] args) {

        Shape Circle1 = new Circle(10); // Создаем объект Circle и сохраняем ссылку в массиве
        Shape Rectangle1 = new Rectangle(2, 3); // Создаем объект Rectangle и сохраняем ссылку в массиве
        Shape Square1 = new Square(2); // Создаем объект Square и сохраняем ссылку в массиве

        System.out.println("Тип фигуры: " + Circle1.getType());
        System.out.println("Площадь: " + Circle1.getArea());
        System.out.println("Периметр: " + Circle1.getPerimeter());
        System.out.println();
        System.out.println("Тип фигуры: " + Rectangle1.getType());
        System.out.println("Площадь: " + Rectangle1.getArea());
        System.out.println("Периметр: " + Rectangle1.getPerimeter());
        System.out.println();
        System.out.println("Тип фигуры: " + Square1.getType());
        System.out.println("Площадь: " + Square1.getArea());
        System.out.println("Периметр: " + Square1.getPerimeter());
    }
}
