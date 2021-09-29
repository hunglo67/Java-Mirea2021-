package Mirea.pr5.task5;
import java.util.Scanner;

public class Solution {
    public static int recursion(int n){
        if(n<10)
            return n;
        else{
            return n%10+recursion(n/10);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();
       System.out.println("Sum of digits of a number: "+recursion(n));
}
}