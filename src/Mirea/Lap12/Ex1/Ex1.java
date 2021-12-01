package Mirea.Lap12.Ex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {
    public Ex1() {
        System.out.println("Введите строку");
        String n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        while (!(n.equals("-1"))) {
            System.out.println("Вводите регулярные выражения");
            String reg;
            reg=sc.nextLine();
            while(!(reg.equals("-1"))){
                Pattern pattern=Pattern.compile(reg);
                Matcher matcher=pattern.matcher(n);
                while (matcher.find()) {
                    System.out.println(n.substring(matcher.start(), matcher.end()));
                }
                reg=sc.nextLine();
            }
            System.out.println("Введите строку");
            n=sc.nextLine();
        }

    }
}