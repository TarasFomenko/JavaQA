package Lesson5.Homework7;

import java.util.Arrays;

public class ArrayFillingLogic {

    public static int[] arrayPopulation(int[] array, int value) {
        array[0] = value;
        return array;
    }

     public static int[] arrayPopulation(int[] array, int value, int position) {
        int [] updatedArray = Arrays.copyOf(array, 11);
        for (int i = updatedArray.length-1; i > position; i--) {
            updatedArray[i]= updatedArray[i-1];
        }
        updatedArray[position] = value;
        return updatedArray;
    }
}

