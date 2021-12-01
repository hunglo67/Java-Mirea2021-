package Mirea.pr9b;

public class SudentNotFoundException extends RuntimeException {
    public SudentNotFoundException(String notFoundStudent) {
        super("Student " + notFoundStudent + " not found!");
    }
}

