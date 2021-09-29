package Mirea.pr3.task2;

public class Square extends Rectangle{
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        width=side;
        length=side;
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);

    }
    public void setLenght(double side){
        super.setLength(side);

    }
    public String toString(){
        return "Shape: Square,side: "+width+",color: "+color+",filled: "+filled;

    }
}
