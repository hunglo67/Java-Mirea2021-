package Mirea.pr5.task3;

public class Solution {
    public static String recursion(int a, int b) {
        // основное условие задачи
        if (a > b) {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a - 1, b);
        } else {
            // Базовый случай
            if (a == b) {
                return Integer.toString(a);
            }
            // Шаг рекурсии / рекурсивное условие
            return a + " " + recursion(a + 1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(20, 15)); // вызов рекурсивной функции
        System.out.println(recursion(10, 15)); // вызов рекурсивной функции
    }
}