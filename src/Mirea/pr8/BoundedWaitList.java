package Mirea.pr8;

import java.util.Collection;

public class BoundedWaitList <E> extends WaitList<E>{
    private int capacity;

    public BoundedWaitList(int capacity){
        super();
        if(capacity <= 0){
            throw new IllegalArgumentException("The maximum size must be greater than 0! Received value: " + capacity);
        }
        else{
            this.capacity = capacity;
        }
    }

    public BoundedWaitList(Collection<E> col){
        super(col);
        this.capacity = col.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Object element) {
        if(content.size() == capacity) {
            throw new IllegalStateException("The queue is full!");
        }
        else{
            content.add((E) element);
        }
    }

    public String toString() {
        return " " + content;
    }
}
