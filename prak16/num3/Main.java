package prak16.num3;
// 3. Реализуйте программу Проверка пароля на Джава с использованием Layout менеджеров компоновки. 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Проверка пароля");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel mainPanel = new JPanel(new BorderLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.anchor = GridBagConstraints.WEST;
            gbc.insets = new Insets(5, 5, 5, 5);
            
            JPanel labelsPanel = new JPanel(new GridLayout(4, 1));
            JLabel serviceLabel = new JLabel("Service:");
            JLabel userLabel = new JLabel("User Name:");
            JLabel passwordLabel = new JLabel("Password:");

            JTextField serviceField = new JTextField();
            JTextField userField = new JTextField();
            JPasswordField passwordField = new JPasswordField();

            JButton checkButton = new JButton("Проверить");

            labelsPanel.add(serviceLabel);
            labelsPanel.add(userLabel);
            labelsPanel.add(passwordLabel);

            mainPanel.add(labelsPanel, BorderLayout.WEST);

            JPanel inputPanel = new JPanel(new GridLayout(4, 1));
            inputPanel.add(serviceField);
            inputPanel.add(userField);
            inputPanel.add(passwordField);

            mainPanel.add(inputPanel, BorderLayout.CENTER);
            mainPanel.add(checkButton, BorderLayout.SOUTH);

            checkButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String password = new String(passwordField.getPassword());
                    // минимум 8 символов, хотя бы 1 большая буква, 1 цифра и один спец. знак
                    if (password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$")) {
                        JOptionPane.showMessageDialog(frame, "Пароль верный", "Результат", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Пароль неверный", "Результат", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            frame.add(mainPanel);
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
