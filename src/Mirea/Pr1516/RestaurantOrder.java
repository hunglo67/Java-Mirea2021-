package Pr1516;

import java.util.*;

public class RestaurantOrder implements Order {
    Node firstNode = null;
    protected String type="local";


    class Node {
        Node next = null;
        Node prev = null;
        orderItem data;

        Node(orderItem data) {
            this.data = data;
        }
    }

    public void add(orderItem data) {
        Node buff = this.firstNode;
        if (buff == null) {
            this.firstNode = new Node(data);
        } else {
            while (buff.next != null)
                buff = buff.next;

            buff.next = new Node(data);
            buff.next.prev = buff;
        }
    }

    orderItem getFirst() {
        Node buff = this.firstNode;
        this.firstNode = this.firstNode.next;

        return (orderItem) buff.data;
    }

    public orderItem getOrderItem(int i) {
        Node buff = this.firstNode;
        for (int j = 0; j < i; j++) {
            buff = buff.next;
        }
        return (orderItem) buff.data;
    }

    public void remove(int i) {
        Node buff = this.firstNode;
        for (int j = 0; j < i; j++) {
            buff = buff.next;
        }
        if (i == 0) {
            firstNode = firstNode.next;
        } else {
            buff.next.prev = buff.prev;
            buff.prev.next = buff.next;
        }

    }

    public boolean remove(String name) {
        Node lastFind = null;

        Node buff = this.firstNode;
        Item or = (Item) ((orderItem) getOrderItem(0)).getObj();
        if (or.getName() == name) {
            lastFind = this.firstNode;
        }
        while (buff.next != null) {
            buff = buff.next;
            Item f = (Item) ((orderItem) buff.data).getObj();
            if (f.getName() == name) {
                lastFind = buff;
            }
        }

        if (lastFind != null) {
            if(lastFind.prev==null){
                if(lastFind.next==null){
                    firstNode=null;
                }else{
                    lastFind=lastFind.next;
                    lastFind.prev=null;
                    firstNode=lastFind;
                }
            }else{
                if(lastFind.next==null){
                    lastFind.prev.next = null;
                }else{
                    lastFind.next.prev = lastFind.prev;
                    lastFind.prev.next = lastFind.next;
                }
            }
        }
        return true;
    }

    public boolean removeAll(String name) {
        Node buff = this.firstNode;
        Item or = (Item) ((orderItem) getOrderItem(0)).getObj();
        if (or.getName() == name) {
            this.firstNode = this.firstNode.next;
            this.firstNode.prev = null;
        }
        while (buff.next != null) {
            buff = buff.next;
            Item f = (Item) ((orderItem) buff.data).getObj();
            if (f.getName() == name) {
                buff.next.prev = buff.prev;
                buff.prev.next = buff.next;
            }
        }
        return true;
    }

    public orderItem[] getOrders() {
        orderItem[] result = new orderItem[this.size()];
        for (int i = 0; i < this.size(); i++)
            result[i] = (orderItem) this.getOrderItem(i);

        return result;
    }

    public String[] getOrdersName() {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            Item it = (Item) ((orderItem) this.getOrderItem(i)).getObj();
            if (result.contains(it.getName())) {
            } else {
                result.add(it.getName());
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public orderItem[] getSortedOrders() {
        orderItem[] buff = getOrders();
        Arrays.sort(buff, new Comparator<orderItem>() {
            public int compare(orderItem o1, orderItem o2) {
                Item one = (Item) ((orderItem) o1).getObj();
                Item two = (Item) ((orderItem) o2).getObj();
                if (one.getPrice() > two.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        return buff;
    }

    public Item getorderItem(int i) {
        return (Item) ((orderItem) this.getOrderItem(i)).getObj();
    }

    public double getCostSummary() {
        double result = 0;
        for (int i = 0; i < this.size(); i++)
            result += this.getorderItem(i).getPrice();

        return result;
    }

    public int dishQuantity() {
        return this.size();
    }


    public int dishQuantity(String name) {
        int result = 0;

        if (((Item) ((orderItem) firstNode.data).getObj()).getName() == name)
            result++;

        Node buff = this.firstNode;
        while (buff.next != null) {
            buff = buff.next;
            Item f = (Item) ((orderItem) buff.data).getObj();
            if (f.getName() == name) {
                result++;
            }
        }

        return result;
    }


    int size() {
        Node buff = this.firstNode;
        if (buff == null) {
            return 0;
        } else {
            int n = 1;
            while (buff.next != null) {
                n++;
                buff = buff.next;
            }
            return n;
        }
    }

    public String getType() {
        return "Restaurant";
    }
}