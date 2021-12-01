package Mirea.Lap12.Ex4;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex4 {
    public Ex4(String str){
        System.out.println("\n"+checker(str));
    }
    public boolean checker(String str){

        return Pattern.compile("(\\d*)(\\s*)(\\+)").matcher(str).find();
    }
}