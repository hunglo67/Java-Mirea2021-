package Pr1516;


import java.util.*;
import Pr1516.util.CycledLinkedList;
import Pr1516.util.ItemsSorter;
import Pr1516.util.MyArrayList;

public class InternetOrder extends CycledLinkedList<Item> implements Order {

    private IItemSelector<Item> getSelectorByName(String name) {
        return (item) -> item.getName() == name;
    }
    public Item[] select(IItemSelector<Item> selector) {
        var result = new MyArrayList<Item>();

        for (int i = 0; i < size; ++i) {
            if (selector.selectIt(next()))
                result.add(current.getData());
        }
        return (Item[])result.toArray();
    }

    public int countOf(IItemSelector<Item> selector) {
        int count = 0;

        for (int i = 0; i < size; ++i)
            if (selector.selectIt(next()))
                ++count;

        return count;
    }

    @Override
    public boolean removeByName(String name) {
        return remove(getSelectorByName(name));
    }

    @Override
    public int removeAllByName(String name) {
        return removeAll(getSelectorByName(name));
    }

    @Override
    public int getCount() {
        return size;
    }

    @Override
    public int getOrderPrice() {
        int result = 0;
        prev();
        for (int i = 0; i < size; ++i)
            result += next().getCost();

        return result;
    }

    @Override
    public int countOf(String name) {
        return countOf(getSelectorByName(name));
    }

    public String[] allNames() {
        Item[] items = toArray();
        var result = new MyArrayList<String>(items.length);

        for (int i = 0; i < items.length; ++i)
            if (!result.contains(items[i].getName()))
                result.add(items[i].getName());

        return (String[])result.toArray();
    }

    public Item[] toSortedArray() {
        Item[] items = toArray();
        ItemsSorter.sort(items);
        return items;
    }
}