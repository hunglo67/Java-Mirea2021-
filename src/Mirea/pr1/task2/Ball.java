package Mirea.pr1.task2;

public class Ball {
    private String type;
    private String color;
    private String size;

    public Ball(String type, String color, String size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }
    public Ball(String type, String color) {
        this.type = type;
        this.color = color;
        this.size = "normal";
    }
    public Ball(String type) {
        this.type = type;
        this.color = "while";
        this.size = "normal";
    }
    public Ball() {
        this.type = "ball";
        this.color = "while";
        this.size = "normal";
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "Ball: " + type + ", Color = " + color + ", Size = " + size;
    }
    public void PaintBall() {
        System.out.println("The Ball: " + type + " has been painted.");
    }
}