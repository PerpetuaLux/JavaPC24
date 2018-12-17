package Java24;

public class PushupPace {
    public static void main(String[] args) {
        int daily = 33;
        int total = 0;

        int x = 0;
        while(x <27) {
            x++;
            total = total + daily;
            System.out.println("Day " + x + ": " + total);
            System.out.println("Day " + x + ": Reps:" + daily);
            daily++;
        }
    }
}
