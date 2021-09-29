package Mirea.pr3.task2;

public class TestShape {
    public static void main(String[] args){
        Shape c1=new Circle(3.2,"red",true);
        System.out.println(c1.toString());
        System.out.println("Area: "+c1.getArea()+"");
        System.out.println("Perimeter: "+c1.getPerimeter()+"");

        Shape r1= new Rectangle(6,4,"white",false);
        System.out.println(r1.toString());
        System.out.println("Area: "+r1.getArea()+"");
        System.out.println("Perimeter: "+r1.getPerimeter()+"");

        Shape s1= new Square(5,"black",true);
        System.out.println(s1.toString());
        System.out.println("Area: "+s1.getArea()+"");
        System.out.println("Perimeter: "+s1.getPerimeter()+"");

        ((Square)s1).setWidth(10);
        System.out.println(s1);
        System.out.println("Area: "+s1.getArea()+"");
        System.out.println("Perimeter: "+s1.getPerimeter()+"");

    }
}
