package Mirea.Lap12.Ex3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex3 {
    public Ex3(String str) {
        Pattern pattern = Pattern.compile("(((\\d+)(\\.?(\\d{1,2})))?\\s?(((USD)|(EU)|(RUB))?))");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group());
        }
    }
}