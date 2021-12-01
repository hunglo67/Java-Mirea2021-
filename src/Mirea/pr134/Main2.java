package Mirea.pr134;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Calendar currentDate = new GregorianCalendar();
        System.out.println("The current date: " + currentDate.getTime());

        Calendar usersDate = new GregorianCalendar();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year, month, day, hour, minute, second: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int sec = scanner.nextInt();

        usersDate.set(year, month, day, hour, min, sec);

        String res = "ERROR";
        if (currentDate.compareTo(usersDate) == 0)
            res = "=";
        if (currentDate.compareTo(usersDate) == 1)
            res = "<";
        if (currentDate.compareTo(usersDate) == -1)
            res = ">";

        System.out.println("Date entered " + res + "The current ");
    }
}