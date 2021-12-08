package Pr1516;

import java.util.HashMap;

public class OrderManager {
    private HashMap<String, Order> allOrders= new HashMap();
    public void add(Dish elem) {
        orderItem<Dish> buff = new orderItem(elem);
        InternetOrder buff1 = new InternetOrder();
        buff1.add(new orderItem<Dish>(elem));
        allOrders.put("",buff1);
    }

    public void add(Drink elem) {
        orderItem<Dish> buff = new orderItem(elem);
        InternetOrder buff1 = new InternetOrder();
        buff1.add(new orderItem<Drink>(elem));
        allOrders.put("",buff1);
    }

    public void add(String address, Order o) throws OrderAlreadyAddedException, IllegalTableNumber {
        if(o.getType().equals("Restaurant") && Integer.parseInt(address.split(" ")[1])<=0)
            throw new IllegalTableNumber("Table with this number not found",Integer.parseInt(address.split(" ")[1]));
        if(allOrders.get(address)!=null){
            throw new OrderAlreadyAddedException("The order with this address already exists",0);
        }else{
            allOrders.put(address,o);
        }
    }
    public void addToOrder(String address, orderItem o){
        Order buff = allOrders.get(address);
        buff.add(o);
        allOrders.put(address,buff);
    }

    public Item getOrder(int i) {
        return (Item) allOrders.get(i);
    }

    public String[] getAllOrders(){
        return allOrders.keySet().toArray(new String[0]);
    }

    public double getCostSummary(){
        int result=0;

        for(String e : allOrders.keySet()){
            Order buff = allOrders.get(e);
            for(int i=0;i<buff.dishQuantity();i++){
                result+=((Item)buff.getOrderItem(i).getObj()).getPrice();
            }
        }
        return result;
    }

    public int dishQuantity(String name){
        int result=0;

        for(String e : allOrders.keySet()){
            Order buff = allOrders.get(e);
            for(int i=0;i<buff.dishQuantity();i++){
                if(((Item)buff.getOrderItem(i).getObj()).getName()==name)
                    result++;
            }
        }
        return result;
    }

    public Order getOrder(String address){ return allOrders.get(address);}

    public boolean removeOrder(int i) {
        allOrders.remove(i);
        return true;
    }
    public boolean removeOrder(String address){
        allOrders.remove(address);
        return true;
    }
}
