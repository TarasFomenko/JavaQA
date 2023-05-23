package Lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Homework11 {
    public static void main(String[] args) {

        Map<Integer, String> itemList = new HashMap<>();
        itemList.put(4, "Ноутбук");
        itemList.put(2, "Кресло");
        itemList.put(3, "Монитор");
        itemList.put(1, "Клавиатура");
        sortedItemChecklist(itemList);
    }

    public static void sortedItemChecklist(Map<Integer, String> getValue) {
        Map<Integer, String> uniqueGetValue = new TreeMap<>(getValue);

        for (Map.Entry<Integer, String> l : uniqueGetValue.entrySet()) {
            System.out.println(l);
        }
    }
}

