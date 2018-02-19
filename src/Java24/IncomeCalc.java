package Java24;

public class IncomeCalc {
    public static String calc(int father, int govern, int job, int exp) {
        return (((father + job - exp + (govern - (job * 0.67))) * 6) + "");
    }
}
