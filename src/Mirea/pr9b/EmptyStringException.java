package Mirea.pr9b;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException() {
        super("Empty Argument!");
    }
}