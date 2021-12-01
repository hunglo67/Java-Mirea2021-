package Mirea.pr10b.Firniture;

public class Test {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Chair chair = factory.createMagicChair();
        Chair chair1 = factory.createVictorianChair(120);
        Chair chair2 = factory.createMultifunctionChair();

        Client client = new Client();
        client.sit(chair);
        client.sit(chair1);
        client.sit(chair2);
    }
}