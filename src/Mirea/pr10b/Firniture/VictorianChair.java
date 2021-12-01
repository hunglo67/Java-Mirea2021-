package Mirea.pr10b.Firniture;

public class VictorianChair implements Chair{
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String typeOfChair() {
        return "Вы выбрали викторианский стул";
    }
}