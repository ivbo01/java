package prak6.num2;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    protected int x, y;
    protected int xspeed, yspeed;

    public MovablePoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "MovablePoint: " + "x = " + x + ", y = " + y + ", xspeed = " + xspeed + ", yspeed = " + yspeed;
    }

    public void moveUp() {
        y += yspeed;
    }

    public void moveDown() {
        y -= yspeed;
    }

    public void moveLeft() {
        x -= xspeed;
    }

    public void moveRight() {
        x += xspeed;
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xspeed, int yspeed, int radius) {
        center = new MovablePoint(x, y, xspeed, yspeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle: " + "radius = " + radius + " " + center;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;     // Верхняя левая точка
    private MovablePoint bottomRight; // Нижняя правая точка

    public MovableRectangle(int x1, int y1, int x2, int y2, int xspeed, int yspeed) {
        if (xspeed != yspeed) {
            System.out.println("Некорректный ввод!");
            yspeed = xspeed;
        }
        topLeft = new MovablePoint(x1, y1, xspeed, yspeed);
        bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle: " + topLeft + " | " + bottomRight;
    }

    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(0, 0, 1, 2);
        System.out.println(point1);

        point1.moveRight();
        System.out.println(point1);

        point1.moveUp();
        System.out.println(point1);

        MovableCircle circle1 = new MovableCircle(0,0,3,4,5);
        System.out.println(circle1);

        circle1.moveRight();
        System.out.println(circle1);

        circle1.moveUp();
        System.out.println(circle1);

        MovableRectangle rectangle1 = new MovableRectangle(1, 1, 2, 2, 2, 2);
        System.out.println(rectangle1);

        rectangle1.moveRight();
        System.out.println(rectangle1);

        rectangle1.moveUp();
        System.out.println(rectangle1);

        MovableRectangle rectangle2 = new MovableRectangle(1, 1, 2, 2, 3, 1000);
        System.out.println(rectangle2);

    }
}
