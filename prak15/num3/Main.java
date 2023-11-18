package prak15.num3;
// 3. Разработайте программу с меню, двумя кнопками и текстовым полем ввода.
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JMenuBar menuBar = new JMenuBar();
        // В этой программе у вас должны быть разные настройки в меню. Должно быть меню «Файл», 
        JMenu fileMenu = new JMenu("Файл");
        JMenuItem saveItem = new JMenuItem("Сохранить"); // которое включает в себя подменю «Сохранить»,
        JMenuItem exitItem = new JMenuItem("Выйти");
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        // и «Правка», включая подменю «Копировать
        JMenu editMenu = new JMenu("Правка");
        JMenuItem copyItem = new JMenuItem("Копировать");
        JMenuItem cutItem = new JMenuItem("Вырезать");
        JMenuItem pasteItem = new JMenuItem("Вставить");
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);

        JMenu helpMenu = new JMenu("Справка");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        JButton button1 = new JButton("Кнопка 1");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.insets = new Insets(5, 5, 5, 5);
        buttonPanel.add(button1, constraints);

        JButton button2 = new JButton("Кнопка 2");
        constraints.gridx = 1;
        constraints.gridy = 0;
        buttonPanel.add(button2, constraints);
        

        JTextArea textArea = new JTextArea();

        // кнопка сохранить
        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Сохранено!\n");
            }
        });

        // кнопка копировать
        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedText = textArea.getSelectedText(); // получаем выделенный текст
                // Помещаем выделенный текст в буфер обмена
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(selectedText);
                clipboard.setContents(stringSelection, null);
            }
        });


        // кнопка вырезать
        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.replaceSelection(""); // Удаляем выделенный текст
            }
        });
        
        // кнопка вставить
        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); // получаем доступ к буферу
                Transferable transferable = clipboard.getContents(this);

                if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) { // проверяем на текстовый формат
                    try {
                        String clipboardText = (String) transferable.getTransferData(DataFlavor.stringFlavor); // извлекаем текст
                        textArea.append(clipboardText); // добавляем в область
                    } catch (UnsupportedFlavorException | IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        
        // кнопка выйти
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        frame.setJMenuBar(menuBar);
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(textArea, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

