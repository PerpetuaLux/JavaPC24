package Java24;

public class HousingTest {
    public static void main(String[] args) {
        int weltonR = 75;
        int astonR = 80;
        int headR = 80;
        int weltonD = 100;
        int astonD = 200;
        int headD = 150;
        int weltonF = 0;
        int astonF = 0;
        int headF = 75;
        boolean weeklyW = false;
        boolean weeklyA = false;
        boolean weeklyH = false;
        boolean cashW = false;
        boolean cashA = false;
        boolean cashH = false;
        int food = 20;
        int budget = 100;
        int cash = 150;

        if ((budget - weltonR - food) > 0) {
            weeklyW = true;
        }
        System.out.println("Weekly W = " + weeklyW);
        if ((cash - (weltonD + weltonF)) > 0) {
            cashW = true;
        }
        System.out.println("Cash W = " + cashW);
        if ((budget - astonR - food) > 0) {
            weeklyA = true;
        }
        System.out.println("Weekly A = " + weeklyA);
        if ((cash - (astonD + astonF)) > 0) {
            cashA = true;
        }
        System.out.println("Cash A = " + cashA);
        if ((budget - headR - food) > 0) {
            weeklyH = true;
        }
        System.out.println("Weekly H = " + weeklyH);
        if ((cash - (headD + headF)) > 0) {
            cashH = true;
        }
        System.out.println("Cash H = " + cashH);

    }

}
