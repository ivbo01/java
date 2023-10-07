package prak5.num1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static int milanScore = 0;
    private static int madridScore = 0;
    private static JLabel resultLabel;
    private static JLabel lastScorerLabel;
    private static JLabel winnerLabel;

    public static void main(String args[]) {
        // Создаем фрейм окна с помощью конструктора
        JFrame frame = new JFrame("My Second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);

        // Создаем панель
        JPanel panel = new JPanel();

        // Задаем свойства панели: цвет фона и размеры
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(300, 150));

        panel.setLayout(new GridLayout(3, 2));

        // одна кнопка JButton подписана “AC Milan”
        // другая JButton подписана “Real Madrid”
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");


        // надпись JLabel содержит текст “Result: 0 X 0”
        // надпись JLabel содержит текст “Last Scorer: N/A”
        // надпись Label содержит текст “Winner: DRAW”;
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        // Всякий раз, когда пользователь нажимает на кнопку AC Milan
        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milanScore++; // результат будет увеличиваться для Милана
                updateLabels("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateLabels("Real Madrid");
            }
        });

        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(resultLabel);
        panel.add(lastScorerLabel);
        panel.add(winnerLabel);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private static void updateLabels(String lastScorer) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        }
        else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        }
        else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}
