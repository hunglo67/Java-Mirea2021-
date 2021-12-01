package Mirea.pr9.Shoponline;

import java.util.ArrayList;

public class Shoponline {
    static ArrayList<Person> buyers = new ArrayList<>();

    // Simulate the work of the database
    public static void setBuyers() {
        buyers.add(new Person("A", "123898139324"));
        buyers.add(new Person("B", "154682397931"));
        buyers.add(new Person("C", "2145799347561"));
        buyers.add(new Person("D", "2349543756499"));
        buyers.add(new Person("E", "743262478313"));
    }

    public static void buy(Person buyer) throws BadTINException {

        Person tmp = null;

        for (Person i : buyers) {
            if (i.getName().equals(buyer.getName())) {
                tmp = i;
            }
        }
        // Throw an exception if TIN is invalid
        assert tmp != null;
        if (!buyer.getTIN().equals(tmp.getTIN())) {
            throw new BadTINException("Bad TIN");
            // Otherwise, the purchase was made
        } else {
            System.out.println("Purchase made!");
        }

    }

    public static void main(String[] args) {
        setBuyers();
        Person me = new Person("A", "123898139324");
        try {
            buy(me);
            // Catch the error
        } catch (BadTINException e) {
            e.printStackTrace();
        }
    }

}