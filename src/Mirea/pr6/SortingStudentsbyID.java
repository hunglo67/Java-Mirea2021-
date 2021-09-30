package Mirea.pr6;


import java.util.Collections;
import java.util.List;

public class SortingStudentsbyID {

    public static void insertSortByIDNumber(List<Student> students) {
        for (int left = 0; left < students.size(); left++) {
            int min = students.get(left).getIdNumber();
            int i = left - 1;
            for (; i >= 0; i--) {
                if (min < students.get(i).getIdNumber()) {
                    Collections.swap(students, i + 1, i);
                } else {
                    break;
                }
            }
        }
    }
}
