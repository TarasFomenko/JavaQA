package Lesson10;


import java.util.*;

public class Homework10 {
    public static void main(String[] args) {
        String groceries = "bread, meat, water, water, potato, tea, meat, rice, sugar, rice";
        System.out.println("Изначально введённая строка: " + groceries);
        System.out.println("------------------------------");
        divideString(groceries);
    }
    public static void divideString(String sentList) {
        String[] regularArray = sentList.replace(",", "").replace(".", "").split(" ");
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(regularArray));
        regularArray = new String[linkedHashSet.size()];
        linkedHashSet.toArray(regularArray);
        for (int i = 0; i < regularArray.length; i++) {
            regularArray[i] = regularArray[i].substring(0, 1).toUpperCase() + regularArray[i].substring(1);
            System.out.println(regularArray[i]);
        }
    }
}

