package Mirea.pr10b.Firniture;

public class ChairFactory implements AbstractChairFactory {
    @Override
    public Chair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public Chair createMultifunctionChair() {
        return new MultifunctionChair();
    }

    @Override
    public Chair createMagicChair() {
        return new MagicChair();
    }
}