package Pr1516;

public interface Order {

    void add(orderItem data);

    boolean remove(String name);

    boolean removeAll(String name);

    int dishQuantity();

    double getCostSummary();

    int dishQuantity(String name);

    String[] getOrdersName();

    orderItem getOrderItem(int i);

    orderItem[] getSortedOrders();

    orderItem[] getOrders();

    String getType();


}