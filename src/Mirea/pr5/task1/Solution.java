package Mirea.pr5.task1;

public class Solution {
    public static String recursion(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(recursion(--n) + " " + j);
        }
        return "";
    }
    public static void main(String[] args) {
        recursion(2);
    }
}
