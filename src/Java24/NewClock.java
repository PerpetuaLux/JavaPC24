package Java24;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class NewClock {
    private JPanel mainPanel;
    private JLabel timeLabel;

    public NewClock() {
            timeLabel.setText(getTime());
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                timeLabel.setText(getTime());
            }
        };
        Timer t = new Timer(1000, taskPerformer);
        t.start();
    }

    public String getTime() {
        String time;
        //get current time and date
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int year = now.get(Calendar.YEAR);
        int second = now.get(Calendar.SECOND);

        String monthName = "";
        switch (month) {
            case 1:
                monthName = ("January");
                break;
            case 2:
                monthName = ("February");
                break;
            case 3:
                monthName = ("March");
                break;
            case 4:
                monthName = ("April");
                break;
            case 5:
                monthName = ("May");
                break;
            case 6:
                monthName = ("June");
                break;
            case 7:
                monthName = ("July");
                break;
            case 8:
                monthName = ("August");
                break;
            case 9:
                monthName = ("September");
                break;
            case 10:
                monthName = ("October");
                break;
            case 11:
                monthName = ("November");
                break;
            case 12:
                monthName = ("December");
        }
        String trueminute = (minute + "");
        if (minute < 10) {
            trueminute = ("0" + minute);
        }
        String truesecond = (second + "");
        if (second < 10) {
            truesecond = ("0" + second);
        }
        time = monthName + " " + day + ", " + year + " " + hour
                + ":" + trueminute + "." + truesecond;
        return (time);
    }

    public static void main(String[] args) {
        JFrame testFrame = new JFrame("NewClock");
        testFrame.setContentPane(new NewClock().mainPanel);
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testFrame.pack();
        testFrame.setLocationRelativeTo(null);
        testFrame.setVisible(true);
    }

}
