package Mirea.pr8.b;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Заполняем нашу коллекцию числами
        IWaitList<Integer> list = new WaitList<>(new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5)));
        System.out.println(list + "  " + list.contains(6) + "  ");
        System.out.println(list.remove() + "  " + list);
        System.out.println("--------------------------------------------------------------");

        //Создаем коллекцию указывая размер в 4 элемента
        IWaitList<String> boundedWaitList = new BoundedWaitList<String>(4);
        boundedWaitList.add("Mike");
        boundedWaitList.add("Sami");
        boundedWaitList.add("Sara");
        boundedWaitList.add("Inu");
        System.out.println(boundedWaitList);
        System.out.println("--------------------------------------------------------------");

        IWaitList<Integer> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add(2);
        unfairWaitList.add(3);
        unfairWaitList.add(6);
        unfairWaitList.add(4);
        unfairWaitList.add(1);

        System.out.println(unfairWaitList);

        unfairWaitList.remove(4);
        System.out.println(unfairWaitList);
        unfairWaitList.remove(2);
        System.out.println(unfairWaitList);
        unfairWaitList.add(4);
        unfairWaitList.add(5);
        System.out.println(unfairWaitList);

    }
}