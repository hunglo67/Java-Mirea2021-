package Mirea.pr10b.Firniture;

public class MagicChair implements Chair{

    public void doMagic(){
        System.out.println("Pooof maaagic");
    }
    @Override
    public String typeOfChair() {
        return "Вы выбрали магический стул. -100 к усталости +200 к продуктивности.";
    }
}