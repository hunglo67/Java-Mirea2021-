package Mirea.pr3.task2;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){}
    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void setLength(double length){
        this.length=length;
    }
    @Override
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2* this.width * this.length;
    }
    public String toString(){
        return "Shape: Rectangle,width: "+width+",length: "+length+",color: "+color+",filled: "+filled;
    }
}
