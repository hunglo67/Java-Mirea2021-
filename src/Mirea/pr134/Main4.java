package Mirea.pr134;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year, month, day, hour, minute, second: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();

        calendar.set(year, month, day, hour,  min, sec);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("In the format yyyy-MM-dd :" + format.format(calendar.getTime()));

        format = new SimpleDateFormat("hh-mm");
        System.out.println("In the format hh-mm :" + format.format(calendar.getTime()));

    }
}