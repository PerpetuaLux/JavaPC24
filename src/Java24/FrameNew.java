package Java24;

import javax.swing.*;
import java.awt.*;

public class FrameNew extends JFrame {
    public FrameNew() {
        super("Test");
        setLookAndFeel();
        setSize(225, 125);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        PanelNew test = new PanelNew("1");
        PanelNew test2 = new PanelNew("2");
        add(test);
        add(test2);
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
    
    public static void main(String[] args) {
        FrameNew clock = new FrameNew();
    }
}