package Mirea.Lap12.TH;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
public class LAB12 {
    static Scanner in = new Scanner(System.in);
    public void ConsoleSplitString1() {//Ex1
        StringBuilder symbol = new StringBuilder("\\");
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the string");
            String line;
            line = in.nextLine();
            System.out.println("Enter by what character to split the string");
            symbol.append(in.next());
            String[] arr = line.split(String.valueOf(symbol));
            for (String element : arr) {
                System.out.println(element);
            }
        }
    }
    public void RegexStr(){//Ex2
        Pattern p1 = Pattern.compile("abcdefjghijklmnopqrstuv18340");
        String str  = "abcdefjghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());

        str  = "123abcdefghijklmnopqrstuv18340";
        System.out.println(str + ": " + p1.matcher(str).matches());
    }
    public void SplitCurrency(){//Ex2.1
        Scanner myScanner = new Scanner(System.in);
        String str = "sfdvbuuv 12.59 RUB svbshvbhbbvsvb 300.00 USD djfnafbj 15.84 EU";
        Pattern pattern = Pattern.compile("(((\\d+)(\\.?(\\d{1,2})))?\\s?(((USD)|(EU)|(RUB))?))");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.print(matcher.group());
        }
        System.out.print("\n");
    }
    public void FindPlus(){//Ex2.2
        ArrayList<String> matches = new ArrayList<>();
        String regex = ".[0-9]+[ ]*[+].*";
        String s;
        System.out.println("Enter text:");//(1 + 8) – 9 / 4
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Expression: " + s + ": " + pattern.matcher(s).matches());
    }
    public void DateChecker(){//Ex2.3
        String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Date:");
        s = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Date: " + s + ": " + pattern.matcher(s).matches());
    }
    public void EmailChecker(){//Ex2.4
        String regex = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Email:");
        s = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Email: " + s + ": " + pattern.matcher(s).matches());
    }
    public void PasswordChecker(){//2.5
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d@$!%*#?&_-]{8,}";
        String s;
        System.out.print("Enter password:");//пример правильных выражений: F032_Password, TrySpy1.пример неправильных выражений: smart_pass, A007
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Password: " + s + ": " + pattern.matcher(s).matches());

    }
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu(){
        LAB12 Lab12 = new LAB12();
        int op;
        System.out.println("What exercise do you want to solve?\n1-Ex1\n2-Ex2\n3-Ex2.1\n4-Ex2.1\n5-Ex2.3\n6-Ex2.4\n7-Ex2.5\n0-Exit");
        op = in.nextInt();
        switch(op){
            case 1:
                Lab12.ConsoleSplitString1();
                Menu();
                break;
            case 2:
                Lab12.RegexStr();
                Menu();
                break;
            case 3:
                Lab12.SplitCurrency();
                Menu();
                break;
            case 4:
                Lab12.FindPlus();
                Menu();
                break;
            case 5:
                Lab12.DateChecker();
                Menu();
                break;
            case 6:
                Lab12.EmailChecker();
                Menu();
                break;
            case 7:
                Lab12.PasswordChecker();;
                Menu();
                break;
            case 0:
                break;
        }
    }
}


