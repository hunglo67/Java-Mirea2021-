package Lap_3;

public class TestDog {
    public static void main(String[] args) {

    Dog[] dogs = new Dog[3];
    dogs[0] = new Pug(5, true);
    dogs[1] = new Pitbull(15, false);
    dogs[2] = new Pug(7,false);
        for (Dog Dog : dogs)
            System.out.println(Dog);
        System.out.println(dogs[0].toString());
        System.out.println(dogs[1].toString());
    }
}

