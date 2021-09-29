package Mirea.pr5.task14;

public class Solution {
    public static String recursion(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(153)); // вызов рекурсивной функции
    }
}