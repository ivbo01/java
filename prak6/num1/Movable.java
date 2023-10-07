package prak6.num1;

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
        return "MovablePoint " + "x = " + x + ", y = " + y + ", xspeed = " + xspeed + ", yspeed = " + yspeed;
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
        return "MovableCircle " + "radius = " + radius + " " + center;
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
    }
}