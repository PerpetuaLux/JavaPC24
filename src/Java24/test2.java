package Java24;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class test2 {


    private JCheckBox exampleBox1;
    private JCheckBox exampleBox2;
    private JCheckBox exampleBox3;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel mainPanel;
    private JTextPane textPane1;
    private JProgressBar progressBar1;
    private JButton increase20Button;
    private JButton decrease20Button;
    private JTextArea textArea1;

    public test2() {
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });
        textArea1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                super.focusGained(e);
                if (textArea1.getText().equals("Type in Here"))
                textArea1.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
                if (textArea1.getText().equals(""))
                textArea1.setText("Type in Here");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar1.setValue(progressBar1.getValue() + 5);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar1.setValue(progressBar1.getValue() - 5);
            }
        });
        increase20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar1.setValue(progressBar1.getValue() + 20);
            }
        });
        decrease20Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar1.setValue(progressBar1.getValue() - 20);
            }
        });
    }

    public static void main(String[] args) {
    JFrame testFrame = new JFrame("test2");
        testFrame.setContentPane(new test2().mainPanel);
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.pack();
        testFrame.setLocationRelativeTo(null);
        testFrame.setVisible(true);
    }

}
