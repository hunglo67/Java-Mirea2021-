package Mirea.pr10b.Firniture;

public interface AbstractChairFactory {
    Chair createVictorianChair(int age);
    Chair createMultifunctionChair();
    Chair createMagicChair();
}