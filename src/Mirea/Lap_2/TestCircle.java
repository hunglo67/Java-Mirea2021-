package Lap_2;


import java.util.Scanner;

public class TestCircle {
    static Scanner in;
    static Circle circle = new Circle(0, 0, 1);
    static double x, y, radius;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        operation();
    }

    public static void operation() {
        int op;
        // double x, y, radius;
        System.out.println("What do you want to do? \\ n1 - set the values of the center of the circle \\ n2 - set the value of the radius play the radius \\ n0 - end the program \")");
        op = in.nextInt();
        switch (op) {
            case 0:
                break;
            case 1:
                System.out.println("Enter the coordinate х");
                x = in.nextDouble();
                circle.setX(x);
                System.out.println("Enter the coordinate у");
                y = in.nextDouble();
                circle.setY(y);
                System.out.println("Circle:x = "+x+",y = "+y+",radius = "+radius);
                operation();
                break;
            case 2:
                System.out.println("Enter the radius");
                radius = in.nextDouble();
                circle.setRadius(radius);
                System.out.println("Circle:radius = "+radius);
                operation();
                break;
            default:
                break;
        }
    }
}