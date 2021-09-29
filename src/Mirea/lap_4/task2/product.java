package Mirea.lap3.task2;
import java.util.Scanner;

public class product {
    static Milk milk = new Milk(1, 56.47);
    static Cheese cheese = new Cheese("gouda", 231.55);
    static Juice juice = new Juice("apple", 57.23);
    static Scanner in;

    public static void main(String[] args){
        in = new Scanner(System.in);
        operation();

    }

    public static void operation(){
        int op;
        System.out.println("What do you want to do ?\n1 - Find out the price of products and their specifications.\n2 - Change product data\n0 - End the program");
        op = in.nextInt();
        switch(op){
            case 1:
                displayInfo();
                break;
            case 2:
                changeInfo();
                break;
            case 0:
                break;
            default: break;

        }
    }

    public static void displayInfo(){
        int op;
        System.out.println("1 - Find out the price\n2 - Their specifications\n0 - End the program");
        op = in.nextInt();
        switch (op){
            case 1:
                System.out.println("Milk price: "+milk.getPrice()+"р, Cheese price: "+cheese.getPrice()+"р, Juice price: "+juice.getPrice()+"р");
                System.out.println();
                displayInfo();
                break;
            case 2:
                System.out.println("Milk volume = "+milk.getVolume()+"л; Type of cheese: "+cheese.getSort()+"; The fruit from which the juice is made: "+juice.getFruit());
                System.out.println();
                displayInfo();
                break;
            case 0:
                operation();
                break;
            default: break;

        }

    }

    public static void changeInfo(){
        int op;
        System.out.println("1 - Change product prices\n2 - Change product data\n0 - End the program");
        op = in.nextInt();
        switch(op){
            case 1:
                double price;
                System.out.println("Enter the price of milk");
                price = in.nextDouble();
                milk.setPrice(price);
                System.out.println("Enter the price of cheese");
                price = in.nextDouble();
                cheese.setPrice(price);
                System.out.println("Enter the price of juice");
                price = in.nextDouble();
                juice.setPrice(price);
                System.out.println();
                changeInfo();
                break;
            case 2:
                double volume;
                String parametr, fruit;
                System.out.println("Enter milk volume ");
                volume = in.nextDouble();
                milk.setVolume(volume);
                System.out.println("Enter the type of cheese");
                in.nextLine();
                parametr = in.nextLine();
                cheese.setSort(parametr);
                System.out.println("Enter the fruit for the juice");
                fruit = in.nextLine();
                juice.setFruit(fruit);
                changeInfo();
                break;
            case 0:
                operation();
                break;
            default: break;

        }
    }
}
