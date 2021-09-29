package Mirea.pr5.task16;

public class Solution {
    public static void recursion(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n > max) {
                recursion(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                recursion(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                recursion(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static void main(String[] args) {
        recursion(0, 0); // вызов рекурсивной функции
    }
}