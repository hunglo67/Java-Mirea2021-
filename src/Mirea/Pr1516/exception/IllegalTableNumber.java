package Pr1516.exception;

public class IllegalTableNumber extends RuntimeException {

    public IllegalTableNumber(String message) {
        super(message);
    }

    public IllegalTableNumber(int n) {
        super("Illegal table number: " + n + ".");
    }
}