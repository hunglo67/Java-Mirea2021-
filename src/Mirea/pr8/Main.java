package Mirea.pr8;

public class Main {
    public static void main(String[] args) {
        UnfairWaitList test1 = new UnfairWaitList();
        BoundedWaitList test2 = new BoundedWaitList(4);

        test1.add("lol");
        test1.add("kek");
        test1.add("cheburek");
        test1.add("NO");

        System.out.println("Here is the content in the list test1: " + test1);
        test1.remove("NO");
        test1.remove("lol");
        System.out.println("Here is the content in the list test1: " + test1);
        System.out.println("Here is the content in the list test1 after deletion: " + test1);
        test1.moveToBack("lol");
        System.out.println("Here is the content in the list test1 after the transfer: " + test1);

        test2.add("kek");
        test2.add("lol");
        test2.add("orbidol");
        test2.add("NOOOOOOO");

        System.out.println("In the list test2: " + test2.getCapacity() + " object and here they are:" + test2);
    }
}