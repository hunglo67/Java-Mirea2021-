package Mirea.pr1.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("football", "black", "big");
        Ball b2 = new Ball("tennis", "yellow");
        Ball b3 = new Ball("american football");
        Ball b4 = new Ball();
        Ball b5 = new Ball();
        b1.setSize("small");
        b3.setSize("big");
        b4.setColor("blue");
        b5.setType("balloon");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        b5.PaintBall();
    }
}