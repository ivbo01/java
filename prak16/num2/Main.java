package prak16.num2;
// 2. Реализуйте программу на Джава с использованием JTextArea и двумя следующего меню выбора:
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Text Editor");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextArea textArea = new JTextArea(10, 30);
            JScrollPane scrollPane = new JScrollPane(textArea);

            JMenuBar menuBar = new JMenuBar();
            JMenu colorMenu = new JMenu("Цвет");
            JMenu fontMenu = new JMenu("Шрифт");

            // Цвет: который имеет возможность выбора из три возможных: синий, красный и черный
            JMenuItem color1 = new JMenuItem("Синий");
            JMenuItem color2 = new JMenuItem("Красный");
            JMenuItem color3 = new JMenuItem("Черный");

            // Шрифт: три вида: “Times New Roman”, “MS Sans Serif”, “Courier New”. 
            JMenuItem font1 = new JMenuItem("Times New Roman");
            JMenuItem font2 = new JMenuItem("MS Sans Serif");
            JMenuItem font3 = new JMenuItem("Courier New");

            color1.addActionListener(new ChangeColor(textArea, new Color(0x008cff))); // Синий
            color2.addActionListener(new ChangeColor(textArea, new Color(0xFF0000))); // Красный
            color3.addActionListener(new ChangeColor(textArea, new Color(0x000000))); // Черный

            font1.addActionListener(new ChangeFont(textArea, "Times New Roman"));
            font2.addActionListener(new ChangeFont(textArea, "MS Sans Serif"));
            font3.addActionListener(new ChangeFont(textArea, "Courier New"));

            frame.setJMenuBar(menuBar);

            colorMenu.add(color1);
            colorMenu.add(color2);
            colorMenu.add(color3);

            fontMenu.add(font1);
            fontMenu.add(font2);
            fontMenu.add(font3);

            menuBar.add(colorMenu);
            menuBar.add(fontMenu);

            frame.add(scrollPane);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static class ChangeColor implements ActionListener {
        private JTextArea textArea; // Вы должны написать программу, которая с помощью меню, может изменять шрифт и цвет текста, написанного в JTextArea 
        private Color color;

        public ChangeColor(JTextArea textArea, Color color) {
            this.textArea = textArea;
            this.color = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            textArea.setForeground(color); // установка цвета для textArea
        }
    }

    private static class ChangeFont implements ActionListener {
        private JTextArea textArea;
        private String fontName;

        public ChangeFont(JTextArea textArea, String fontName) {
            this.textArea = textArea;
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Font currentFont = textArea.getFont();
            Font newFont = new Font(fontName, currentFont.getStyle(), currentFont.getSize());
            textArea.setFont(newFont); // установка шрифта для textArea
        }
    }
}

