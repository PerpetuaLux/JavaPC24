package Java24;

import javax.swing.*;
import java.util.Calendar;

public class PanelNew extends JPanel {
    public PanelNew(String Input) {
        super();
        JLabel test = new JLabel("Test: " + Input);
        add(test);
    }
}