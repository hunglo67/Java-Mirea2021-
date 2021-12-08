package Pr1516;

public final class Dish implements Item {
    private int price;
    private String name;
    private String desc;

    Dish(String name, String desc){
        price=0;
        this.name=name;

        this.desc=desc;
    }
    public Dish(int price, String name, String desc){
        if(price<0 || name.equals("") || desc.equals(""))
            throw new IllegalArgumentException("The argument must be more then 0 and not equals empty symbol.");
        this.price=price;
        this.name=name;
        this.desc=desc;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}