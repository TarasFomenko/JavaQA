package Lesson5.Homework7;

import java.util.Scanner;

public class ArrayFilling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int size = 0;
//        System.out.println("Введите размер массива");
//        if (scanner.hasNextInt()) {
//            size = scanner.nextInt();
//        } else {
//            System.out.println("Ввёденный символ не является целочисленным числом");
//            System.exit(0);
//        }
//
//        int[] array = new int[0];
//        if (size <= 0) {
//            System.out.println("Массив не может быть отрицательным или нулевым");
//            System.exit(0);
//        } else {
//            array = new int[size];
//        }
//        System.out.println(Arrays.toString(array));

        int value = 0;
        int[] array = new int[10];
        System.out.println("Введите число");
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.println("Значение в массиве не может быть буквой или символом");
            System.exit(0);
        }
        System.out.println(value);

        ArrayFillingLogic arrayFillingLogic = new ArrayFillingLogic();
        ArrayFillingLogic.arrayOnlyValue(array, value);

    }
}



