package Java24;

import javax.swing.*;
import javax.swing.JTextArea;
import java.awt.*;
import java.io.IOException;

public class GooeyTemplate extends JFrame{

    public GooeyTemplate() {
        super("GooeyTemplate");
        //Set the initial layout
        setLookAndFeel();
        setSize(550, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout layout = new GridLayout(5, 1, 10, 10);
        setLayout(layout);

     //Begin by initialising rows
        JPanel exampleRow1 = new JPanel();
        JPanel exampleRow2 = new JPanel();
        JPanel exampleRow3 = new JPanel();
        JPanel exampleRow4 = new JPanel();
        JPanel exampleRow5 = new JPanel();

     //Set up any object to be within the initialised rows
        //Example of a Button Group, begin by initializing the group
        ButtonGroup exampleGroup = new ButtonGroup();

        //Then initialize the buttons themselves
        JCheckBox exampleCheckBox1 = new JCheckBox();
        JCheckBox exampleCheckBox2 = new JCheckBox();
        JCheckBox exampleCheckBox3 = new JCheckBox();

        //Add the Check boxes to the group
        exampleGroup.add(exampleCheckBox1);
        exampleGroup.add(exampleCheckBox2);
        exampleGroup.add(exampleCheckBox3);

        //Set up the Labels, first value in constructor is the displayed text, second is the alignment
        JLabel exampleLabel1 = new JLabel("Text 1", JLabel.CENTER);
        JLabel exampleLabel2 = new JLabel("Text 2", JLabel.CENTER);
        JLabel exampleLabel3 = new JLabel("Text 3", JLabel.CENTER);
        JLabel exampleLabel4 = new JLabel("Text 4", JLabel.CENTER);

        //Set up the Text Fields, value in the constructor is the initial displayed text
        JTextField exampleTextField1 = new JTextField("TextField Text 1");
        JTextField exampleTextField2 = new JTextField("TextField Text 1");
        JTextField exampleTextField3 = new JTextField("TextField Text 1");
        JTextField exampleTextField4 = new JTextField("TextField Text 1");

        //Set up any Text Area, first value in constructor is the rows, second is the columns
        JTextArea exampleTextArea = new JTextArea("test");
        exampleTextArea.setLineWrap(true);
        exampleTextArea.setWrapStyleWord(true);
        exampleTextArea.setEditable(true);

        //The scroll pane allows you to scroll when the text goes over the size of the area
        JScrollPane areaScrollPane = new JScrollPane(exampleTextArea);
        areaScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        areaScrollPane.setPreferredSize(new Dimension(250, 250));
        areaScrollPane.setBorder(
                BorderFactory.createCompoundBorder(
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createTitledBorder("Example Text Area"),
                                BorderFactory.createEmptyBorder(1,1,1,1)),
                        areaScrollPane.getBorder()));

        //Set up any Buttons
        JButton exampleButton1 = new JButton("Example1");
        JButton exampleButton2 = new JButton("Example2");
        JButton exampleButton3 = new JButton("Example3");

        //Create the Layouts
        FlowLayout layout1 = new FlowLayout(FlowLayout.CENTER, 10, 10);
        GridLayout layout2 = new GridLayout(1, 4, 10, 10);
        GridLayout layout3 = new GridLayout(1, 4, 10, 10);
        GridLayout layout4 = new GridLayout(1, 1, 10, 10);
        GridLayout layout5 = new GridLayout(1, 3, 10, 10);

        //Set the layouts
        exampleRow1.setLayout(layout1);
        exampleRow2.setLayout(layout2);
        exampleRow3.setLayout(layout3);
        exampleRow4.setLayout(layout4);
        exampleRow5.setLayout(layout5);

        //Add Components to Row 1
        exampleRow1.add(exampleCheckBox1);
        exampleRow1.add(exampleCheckBox2);
        exampleRow1.add(exampleCheckBox3);
        //Then add Row 1
        add(exampleRow1);

        //Add Components to Row 2
        exampleRow2.add(exampleLabel1);
        exampleRow2.add(exampleLabel2);
        exampleRow2.add(exampleLabel3);
        exampleRow2.add(exampleLabel4);
        //Then add Row 2
        add(exampleRow2);

        //Add Components to Row 2
        exampleRow3.add(exampleTextField1);
        exampleRow3.add(exampleTextField2);
        exampleRow3.add(exampleTextField3);
        exampleRow3.add(exampleTextField4);
        //Then add Row 3
        add(exampleRow3);

        //Add Components to Row 4
        exampleRow4.add(areaScrollPane);
        //Then add Row 4
        add(exampleRow4);

        //Add Components to Row 5
        exampleRow5.add(exampleButton1);
        exampleRow5.add(exampleButton2);
        exampleRow5.add(exampleButton3);
        //Then add Row 5
        add(exampleRow5);

        //Make the frame visible
        setVisible(true);
    }

    //Create the setLookAndFeel Method
    private void setLookAndFeel() {
        try{
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            //ignore error
        }
    }

    public static void main(String[] args) {
        GooeyTemplate Frame = new GooeyTemplate();
    }
}
