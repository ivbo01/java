package prak5.num3;
// prak5/num3/image.png
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Создаем фрейм окна с помощью конструктора
        JFrame frame = new JFrame("Image Display");
        
        // Устанавливаем реакцию окна на закрытие по умолчанию
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel image1 = new JLabel(new ImageIcon(args[0]));

        frame.getContentPane().add(image1);
        frame.pack();
        frame.setVisible(true);
    };
}