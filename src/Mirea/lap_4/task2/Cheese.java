package Mirea.lap3.task2;

public class Cheese implements Priceable {
    private String cheese;
    private double price;

    public Cheese(String sort, double price){
        this.cheese = cheese;
        this.price = price;
    };

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSort() {
        return cheese;
    }

    public void setSort(String sort) {
        this.cheese = sort;
    }
}