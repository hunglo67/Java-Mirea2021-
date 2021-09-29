package Option5;
import java.util.Scanner;

public class Option5 {
    private static void calculateFactorial(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Enter a number to find its factorial: ");
        number = in.nextInt();
        calculateFactorial(number);
    }
}

