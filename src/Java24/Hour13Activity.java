package Java24;

import javax.swing.*;

public class Hour13Activity extends JFrame {
    public Hour13Activity() {
        super("Hello World!");
        setLookAndFeel();
        setSize(225, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel hello = new JLabel("Hello World!");
        add(hello);
        setVisible(true);
        SalutonFrame hal = new SalutonFrame();
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            //ignore error
        }
    }
    
    public static void main(String[] arguments) {
        Hour13Activity sal = new Hour13Activity();
    }
}