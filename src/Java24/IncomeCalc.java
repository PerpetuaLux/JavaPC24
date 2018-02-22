package Java24;

public class IncomeCalc {

    public static double governcalc(int govern, int job) {
    double result = govern - (job * 0.67);
    if (result < 0) {
        return 0;
    } else {
        return result;
    }
    }
    public static String calc(int father, int govern, int job, int exp) {
        return (((father + job - exp + governcalc(govern, job)) * 6) + "");
    }
}
