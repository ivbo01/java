package prak4_1.num8;
// Перепишите суперкласс Shape из задания 1, сделайте его абстрактным и наследуйте подклассы, так как это представлено на UML диаграмме на рис. 4.1 Circle, Rectangle и Square.
public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}

