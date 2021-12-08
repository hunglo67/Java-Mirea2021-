package Pr1516;

public class IllegalTableNumber extends Exception {
    private int number;

    public int getNumber() {
        return number;
    }

    public IllegalTableNumber(String message, int num) {

        super(message);
        number = num;
    }
}