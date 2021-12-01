package Mirea.pr134;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main1 {
    public static void main(String[] args) {
        String LN = "Lo";

        Calendar date1 = new GregorianCalendar();
        date1.set(2000, 12, 06, 13, 40, 6);

        Calendar date2 = new GregorianCalendar();
        date2.set(2021, 12, 29, 6, 3, 7);

        System.out.println("Last name: " + LN);
        System.out.println("Date taken: " + date1.getTime());
        System.out.println("Date of delivery: " + date2.getTime());
    }
}