import javax.swing.*;

public class SalutonFrame extends JFrame {
    public SalutonFrame() {
        super("Saluton mondo!");
        setLookAndFeel();
        setSize(225, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //the following 2 lines were added as part of the hour 13 activity 1
        JLabel hello = new JLabel("Saluton Mondo!");
        add(hello);
        setVisible(true);
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
        SalutonFrame sal = new SalutonFrame();
    }
}