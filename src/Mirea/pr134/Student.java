package Mirea.pr134;

import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    private String name;
    private Calendar dateOfBirthday;

    public Student(String name, Calendar dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(dateOfBirthday.getTime());
    }
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2000, 7, 6, 0,  0, 0);
        Student student = new Student("Lo Van Hung", calendar);

        System.out.println(student.toString());
    }
}
