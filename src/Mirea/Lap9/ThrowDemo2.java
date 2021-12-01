package Mirea.Lap9;

import java.util.Scanner;

public class ThrowDemo2 {
    public void getKey() {
        while(true) {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();

            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Bad key");
                e.printStackTrace();
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowDemo2 throwsDemo2 = new ThrowDemo2();
        throwsDemo2.getKey();
    }

}