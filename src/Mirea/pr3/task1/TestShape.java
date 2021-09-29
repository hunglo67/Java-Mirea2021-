package Mirea.pr3.task1;

public class TestShape {
    public static void main(String[] args){
        Shape s1= new Circle(6,"red",true);
        Shape s2= new Circle();
        Shape s3= new Circle();
        s2.setColor("white");
        s3.setFilled(false);
        ((Circle)s3).setRadius(2.6);
        System.out.println(s1.toString());
        System.out.println("Area: "+s1.getArea());
        System.out.println("Perimeter: "+s2.getPerimeter());
        System.out.println(s2.toString());
        System.out.println("Area: "+s2.getArea());
        System.out.println("Perimeter: "+s2.getPerimeter());
        System.out.println(s3.toString());
        System.out.println("Area: "+s3.getArea());
        System.out.println("Perimeter: "+s3.getPerimeter());
    }

}
