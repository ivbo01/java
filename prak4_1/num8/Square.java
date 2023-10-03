package prak4_1.num8;

public class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side); // Вызываем конструктор суперкласса Rectangle с заданными параметрами (одинаковой длиной и шириной)
    }

    public double getSide() {
        return getWidth(); // Метод получения длины стороны квадрата
    }

    public void setSide(double side) {
        setWidth(side);  // Метод установки длины стороны квадрата
        setLength(side); // Установка ширины как длины
    }
    // Переопределяем метод setWidth так, чтобы он устанавливал ширину и длину одновременно
    @Override
    public void setWidth(double side) {
        super.setWidth(side); // Вызываем метод суперкласса для установки ширины (и длины)
        super.setLength(side); // Устанавливаем длину также равной стороне
    }

    // Переопределяем метод setLength так, чтобы он устанавливал длину и ширину одновременно
    @Override
    public void setLength(double side) {
        super.setLength(side); // Вызываем метод суперкласса для установки длины (и ширины)
        super.setWidth(side); // Устанавливаем ширину также равной стороне
    }
    @Override
    public String toString() {
        return "Square[side=" + getSide() + "," + super.toString() + "]";
    }
}
