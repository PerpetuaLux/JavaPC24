package Java24;

public class StarPower {

    public static double star(double a, double b) {
        return a + (a*b) + b;
    }
    public static double starPower(double x, int n) {
        if (n == 0) {
            return 1;
        }
        int c = n;
        double result = 0;
        double process = x;
        while (c > 1) {
            process = star(x, process);
            c--;
        }
        return process;
    }
    public static void main(String... args) {
        System.out.println(starPower(7, 7));
    }

}
