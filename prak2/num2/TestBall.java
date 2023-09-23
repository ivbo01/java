package prak2_2;
import java.util.Scanner;

public class TestBall {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
				System.out.print("x: ");
        double inputX = sc.nextInt();
				System.out.print("y: ");
        double inputY = sc.nextInt();

        Ball ball1 = new Ball(inputX, inputY);

        Ball ball2 = new Ball(inputX, inputY);

        Ball ball3 = new Ball(inputX, inputY);

        ball2.setXY(12, 23);
        ball3.move(9, 8);

        System.out.println("Ball1: " + ball1.toString());
        System.out.println("Ball2: " + ball2.toString());
        System.out.println("Ball3: " + ball3.toString());
    }
}