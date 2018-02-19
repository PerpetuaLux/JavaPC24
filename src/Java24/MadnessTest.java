package Java24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MadnessTest extends JFrame {

    //set up row 1
    JPanel row1 = new JPanel();
    ButtonGroup option = new ButtonGroup();
//    JCheckBox quickpick = new JCheckBox("Quick Box", false);
//    JCheckBox personal = new JCheckBox("Personal", true);
    JLabel numbersLabe2 = new JLabel("Father", JLabel.RIGHT);
    JLabel numbersLabe3 = new JLabel("Government", JLabel.RIGHT);
    JLabel numbersLabe4 = new JLabel("Job", JLabel.RIGHT);
    //set up row 2
    JPanel row2 = new JPanel();
    JLabel numbersLabel = new JLabel("Incoming: ", JLabel.RIGHT);
    JTextField[] numbers = new JTextField[6];
    private String myString;
    JLabel winnersLabel = new JLabel("Outgoing: ", JLabel.RIGHT);
    JTextField[] winners = new JTextField[6];
    //set up row 3
    JPanel row3 = new JPanel();
    JButton stop = new JButton("Stop");
    public static JButton play = new JButton("Calculate");
    JButton reset = new JButton("Reset");
    //set up row 4
    JPanel row4 = new JPanel();
    JLabel got3Label = new JLabel("3 of 6: ", JLabel.RIGHT);
    JTextField got3 = new JTextField("0");
    JLabel got4Label = new JLabel("4 of 6: ", JLabel.RIGHT);
    JTextField got4 = new JTextField("0");
    JLabel got5Label = new JLabel("5 of 6: ", JLabel.RIGHT);
    JTextField got5 = new JTextField("0");
    JLabel got6Label = new JLabel("6 of 6: ", JLabel.RIGHT);
    JTextField got6 = new JTextField("0", 10);
    JLabel drawingsLabel = new JLabel("Drawings: ", JLabel.RIGHT);
    JTextField drawings = new JTextField("0");
    JTextField results = new JTextField("0");
    JLabel yearsLabel = new JLabel("Years: ", JLabel.RIGHT);
    JTextField years = new JTextField();

    public MadnessTest() {
        super("Income Calculator");
        setLookAndFeel();
        setSize(550, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5, 1, 10, 10);
        setLayout(layout);
        
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 100, 10);
//        option.add(quickpick);
//        option.add(personal);
        row1.setLayout(layout1);
        row1.add(numbersLabe2);
        row1.add(numbersLabe3);
        row1.add(numbersLabe4);
//        row1.add(quickpick);
//        row1.add(personal);
        add(row1);
        
        GridLayout layout2 = new GridLayout(2, 3, 10, 10);
        row2.setLayout(layout2);
//        row2.add(numbersLabel);
        for (int i = 0; i < 3; i++) {
            numbers[i] = new JTextField();
            numbers[i].setText("0");
            row2.add(numbers[i]);
        }
//        row2.add(winnersLabel);
        for (int i = 0; i < 3; i++) {
            winners[i] =new JTextField();
            row2.add(winners[i]);
        }
        winners[1].setText("0");
        winners[2].setEditable(false);
        winners[2].setBackground(Color.black);
        winners[0].setEditable(false);
        winners[0].setBackground(Color.black);
        add(row2);
        MadnessTest.play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String father = numbers[0].getText();
                String govern = numbers[1].getText();
                String job = numbers[2].getText();
                String costs2 = winners[1].getText();
                int father2 = Integer.parseInt(father);
                int job2 = Integer.parseInt(job);
                int govern2 = Integer.parseInt(govern);
                int costs4 = Integer.parseInt(costs2);
                results.setText(IncomeCalc.calc(father2, govern2, job2, costs4));
                System.out.println(IncomeCalc.calc(father2, govern2, job2, costs4));
            }
        });
        
        FlowLayout layout3 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        row3.setLayout(layout3);
        stop.setEnabled(false);
        row3.add(play);
        add(row3);
        
        GridLayout layout4 = new GridLayout(2, 1, 20, 10);
        row4.setLayout(layout4);
        row4.add(results);
//        row4.add(got3Label);
//        got3.setEditable(false);
//        row4.add(got3);
//        row4.add(got4Label);
//        got4.setEditable(false);
//        row4.add(got4);
//        row4.add(got5Label);
//        got5.setEditable(false);
//        row4.add(got5);
//        row4.add(got6Label);
//        got6.setEditable(false);
//        row4.add(got6);
//        row4.add(drawingsLabel);
//        drawings.setEditable(false);
//        row4.add(drawings);
//        row4.add(yearsLabel);
//        years.setEditable(false);
//        row4.add(years);
        add(row4);
        
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            //ignore error
        }
    }
    
    public static void main(String[] arguments) {
        MadnessTest frame = new MadnessTest();
    }
}