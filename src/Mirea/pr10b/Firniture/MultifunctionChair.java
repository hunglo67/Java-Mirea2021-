package Mirea.pr10b.Firniture;

public class MultifunctionChair implements Chair{
    public int sum(int a, int b){
        return a+b;
    }

    @Override
    public String typeOfChair() {
        return "Вы выбрали мультифункциональный стул";
    }
}