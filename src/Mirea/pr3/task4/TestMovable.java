package Mirea.pr3.task4;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(20, 30, 10, 5);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovablePoint(9, 10,4,5);
        System.out.println(m2);
        m2.moveUp();
        System.out.println(m2);

        MovableCircle m3 = new MovableCircle(2, 2, 1, 1, 10);
        System.out.println("");

        Movable[] movableArray = new Movable[3];
        movableArray[0] = m1;
        movableArray[1] = m2;
        movableArray[2] = m3;
        for(Movable movable : movableArray) {
            System.out.println(movable);
        }

        movableArray[0].moveDown();
        movableArray[0].moveRight();
        movableArray[1].moveLeft();
        movableArray[1].moveUp();
        movableArray[2].moveDown();
        movableArray[2].moveLeft();
        for(Movable movable : movableArray) {
            System.out.println(movable);
        }
    }
}

