package Pr1516.util;

import Pr1516.Item;

public class ItemsSorter {
    public static void sort(Item[] items) {
        for (int i = 0; i < items.length - 1; ++i)
            for (int j = i + 1; j < items.length; ++j)
                if (items[i].getCost() < items[j].getCost()) {
                    var temp = items[i];
                    items[i] = items[j];
                    items[j] = temp;
                }
    }
}