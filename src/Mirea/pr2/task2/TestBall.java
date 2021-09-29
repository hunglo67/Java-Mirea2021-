package Mirea.pr2.task2;

public class TestBall {
    public static void main(String[]args){
        Ball b1=new Ball(90,99);
        Ball b2=new Ball();
        b2.move(30,45);
        System.out.println(b1.toString());
        System.out.println(b2);
}
}