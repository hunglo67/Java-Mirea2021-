package Mirea.Lap9;

import java.util.Scanner;

public class Throwsdemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        try {
            printDetails(key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);

    }

    private String getDetails(String key) throws Exception {
        if (key.equals("1")) {
            throw new Exception("Key set to empty string");
        }
        return "Data for " + key;
    }

    public static void main(String[] args) {
        Throwsdemo throwsDemo = new Throwsdemo();
        throwsDemo.getKey();
    }
}
