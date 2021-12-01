package Mirea.pr9.Shoponline;

public class BadTINException extends IllegalArgumentException {
    public BadTINException(String message) {
        super(message);
    }
}