package prak12.num1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

abstract class MyShape extends Pane {
    // Абстрактный класс для описания свойств фигуры
    public MyShape(Color color, double x, double y) {
        setTranslateX(x);
        setTranslateY(y);
    }
}

class MyCircle extends MyShape {
    // Класс для круга
    public MyCircle(Color color, double x, double y, double radius) {
        super(color, x, y);
        Circle circle = new Circle(radius);
        circle.setFill(color);
        getChildren().add(circle);
    }
}

class MyRectangle extends MyShape {
    // Класс для прямоугольника
    public MyRectangle(Color color, double x, double y, double width, double height) {
        super(color, x, y);
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.setFill(color);
        getChildren().add(rectangle);
    }
}

public class Main extends Application {
    public void start(Stage mainFrameStage) {
        Pane root = new Pane();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            Color randomColor = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            double x = random.nextDouble() * 400; // случайная позиция по X
            double y = random.nextDouble() * 400; // случайная позиция по Y

            // Случайно выбираем между кругом и прямоугольником
            if (random.nextBoolean()) {
                double radius = random.nextDouble() * 50 + 10; // случайный радиус для круга
                MyCircle circle = new MyCircle(randomColor, x, y, radius);
                root.getChildren().add(circle);
            } else {
                double width = random.nextDouble() * 50 + 10; // случайная ширина для прямоугольника
                double height = random.nextDouble() * 50 + 10; // случайная высота для прямоугольника
                MyRectangle rectangle = new MyRectangle(randomColor, x, y, width, height);
                root.getChildren().add(rectangle);
            }
        }

        Scene scene = new Scene(root, 400, 400);
        mainFrameStage.setTitle("Random Shapes");
        mainFrameStage.setScene(scene);
        mainFrameStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
