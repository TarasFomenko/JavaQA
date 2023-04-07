package Lesson5.Homework7;

public class ArrayFillingLogic {

    public static int[] arrayPopulation(int[] array, int value) {
        array[0] = value;
        return array;
    }

     public static int[] arrayPopulation(int[] array, int value, int position) {
        for (int i = array.length-1; i > position; i--) {
            array[i]=array[i-1];
        }
        array[position] = value;
        return array;
    }
}

