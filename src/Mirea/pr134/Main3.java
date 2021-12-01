package Mirea.pr134;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main3 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2000, 7, 6, 0,  0, 0);
        Student student = new Student("Lo Van Hung", calendar);

        System.out.println(student.toString());
    }
}