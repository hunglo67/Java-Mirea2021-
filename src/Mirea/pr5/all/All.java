package Mirea.pr5.all;

import java.util.Scanner;

public class All {
    static Scanner in;

    public static String recursion1(int n) {//task1
        int sum = 0;
        int j = 0;
        if (n == 1) {
            return "1" ;
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
         return   recursion1(--n) + " " + j ;
        }
    }

    public static String recursion2(int n) {//task2
        if (n == 1) {
            return "1";
        }
        return recursion2(n - 1) + " " + n;
    }

    public static String recursion3(int a, int b) {//task3
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion3(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            return a + " " + recursion3(a + 1, b);
        }
    }

    public static int recursion4(int len, int sum, int k, int s) {//task4
        // Базовый случай
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion4(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int recursion5(int n) {//task5
        if (n < 10)
            return n;
        else {
            return n % 10 + recursion5(n / 10);
        }
    }

    public static boolean recursion6(int n, int i) {//task6
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return recursion6(n, i + 1);
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        operation();
    }

    public static void operation() {
        System.out.println("What exercise would you like to do:\n1-Task1\n2-Task2\n3-Task3\n4-Task4\n5-Task5\n6_Task6\n0_End the programm");
        int op = in.nextInt();
        switch (op) {
            case 1: {
                System.out.println("Enter number:");
                int n = in.nextInt();
                System.out.println("Triangular sequence:"+ recursion1(n));
                operation();
                break;
            }
            case 2: {
                System.out.println("Enter number:");
                int n = in.nextInt();
                System.out.println("All numbers from 1 to n : " + recursion2(n));
                operation();
                break;
            }
            case 3: {
                System.out.println("Enter a:");
                int a = in.nextInt();
                System.out.println("Enter b:");
                int b = in.nextInt();
                System.out.println(recursion3(a, b));
                operation();
                break;
            }
            case 4: {
                System.out.println("Enter k:");
                int k = in.nextInt();
                System.out.println("Enter s:");
                int s = in.nextInt();
                System.out.println(recursion4(0, 0, k, s));
                operation();
                break;
            }
            case 5: {
                System.out.println("Enter number:");
                int n = in.nextInt();
                System.out.println("Sum of digits of a number: " + recursion5(n));
                operation();
                break;
            }
            case 6: {
                System.out.println("Enter number: ");
                int n = in.nextInt();
                System.out.println("Result : " +recursion6(n, 2));
                operation();
                break;
            }
            case 0:
                break;
            default:
                break;
        }
    }
}

