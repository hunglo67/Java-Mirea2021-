package Pr1516;

import java.util.Enumeration;

public final class Drink implements Item {
    private int price;
    private String name;
    private String desc;
    private Enumeration type;

    Drink(String name, String desc){
        price=0;
        this.name=name;

        this.desc=desc;
    }
    public Drink(int price, String name, String desc){
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

    public Enumeration getType(){return type;}
    public void setType(Enumeration type){
        this.type=type;
    }
}