package Java24;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this.year = 2018;
        this.month = 2;
        this.day = 19;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public static void main(String[] args) {
        Date birth = new Date(1999, 4, 10);
        System.out.println(birth);
    }
}
