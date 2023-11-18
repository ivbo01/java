package prak15.num2;
// 2. Разработайте программу выбора меню как на рис. 15.8 ниже. Вам понадобится JComboBox. 
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Information");

        String[] countries = {"Australia", "China", "England", "Russia"};
        JComboBox<String> ComboBox1 = new JComboBox<>(countries);
        ComboBox1.setBounds(50, 20, 150, 20);

        JTextArea TextInfoContry = new JTextArea();
        TextInfoContry.setBounds(50, 45, 300, 300);

        ComboBox1.addActionListener(new ActionListener() { // При выборе пункта меню должна выводится информация о стране  3
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) ComboBox1.getSelectedItem();
                String countryInfo = "Information about " + selectedCountry;
                TextInfoContry.setText(countryInfo);
            }
        });

        frame.add(ComboBox1);
        frame.add(TextInfoContry);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
