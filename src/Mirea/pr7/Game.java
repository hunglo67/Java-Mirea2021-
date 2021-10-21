package pr7;

import java.util.*;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        operation();
    }

   public static void operation(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("1_To implement the task via Stack, enter 1\n2_To implement the task via Queue\n3_To implement the task via Dequeue\n4_To implement the task via DoubleList\n0_Exit");
        int chosenVar = scanner.nextInt();
        switch (chosenVar){
            case 1:
                stack();
                operation();
                break;
            case 2:
                queue();
                operation();
                break;
            case 3:
                dequeue();
                operation();
                break;
            case 4:
                doubleList();
                operation();
                break;
            case 0:
                break;
            default :
                break;
        }
    }

    public static void stack(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 First Player Cards (0-9)");
        String[] cards_st = scanner.nextLine().split(" ");
        Stack<Integer> cards_1 = new Stack<>();
        for (int i=0; i<cards_st.length; i++){
            cards_1.add(Integer.parseInt(cards_st[i]));
        }

        Stack <Integer> cards_2 = new Stack<>();
        System.out.println("Enter 5 First Player Cards (0-9)");
        cards_st = scanner.nextLine().split(" ");
        for (int i=0; i<cards_st.length; i++){
            cards_2.add(Integer.parseInt(cards_st[i]));
        }

        System.out.println(Creat_Stack.play(cards_1, cards_2));
    }

    public static void queue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 First Player Cards (0-9)");
        String[] cards_st = scanner.nextLine().split(" ");
        Queue<Integer> cards_1 = new LinkedList<>();
        for (int i=cards_st.length - 1; i>=0; i--){
            cards_1.add(Integer.parseInt(cards_st[i]));
        }

        Queue<Integer> cards_2 = new LinkedList<>();
        System.out.println("Enter 5 First Player Cards (0-9)");
        cards_st = scanner.nextLine().split(" ");
        for (int i=cards_st.length - 1; i>=0; i--){
            cards_2.add(Integer.parseInt(cards_st[i]));
        }

        System.out.println(Creat_Queue.play(cards_1, cards_2));
    }

    public static void dequeue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 First Player Cards (0-9)");
        String[] cards_st = scanner.nextLine().split(" ");
        Deque<Integer> cards_1 = new LinkedList<>();
        for (int i=cards_st.length-1; i>=0; i--){
            cards_1.add(Integer.parseInt(cards_st[i]));
        }

        Deque<Integer> cards_2 = new LinkedList<>();
        System.out.println("Enter 5 First Player Cards (0-9)");
        cards_st = scanner.nextLine().split(" ");
        for (int i=cards_st.length-1; i>=0; i--){
            cards_2.add(Integer.parseInt(cards_st[i]));
        }

        System.out.println(Creat_Deque.play(cards_1, cards_2));
    }

    public static void doubleList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 First Player Cards (0-9)");
        String[] cards_st = scanner.nextLine().split(" ");
        LinkedList<Integer> cards_1 = new LinkedList<>();
        for (int i=0; i<cards_st.length; i++){
            cards_1.add(Integer.parseInt(cards_st[i]));
        }

        LinkedList <Integer> cards_2 = new LinkedList<>();
        System.out.println("Enter 5 First Player Cards (0-9)");
        cards_st = scanner.nextLine().split(" ");
        for (int i=0; i<cards_st.length; i++){
            cards_2.add(Integer.parseInt(cards_st[i]));
        }

        System.out.println(Creat_Double_List.play(cards_1, cards_2));
    }
}