package Lesson5.Homework7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayFilling {
    private static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Делаю рандомный массив, чтобы интереснее было
        int size = 10;
        int upperBound = 25;
        int[] array = new int[size];
        Random random = new Random();
        IntStream.range(0, size).forEach(index -> array[index] = random.nextInt(upperBound));

        //Прошу ввести число с консоли с проверками
        int value = 0;
        System.out.println("\nВведите число");
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.println("Значение в массиве не может быть буквой, символом, или не целым числом");
            System.exit(0);
        }

        //Задаю позицию с проверками. Если это не int - выхожу их программы
        int position = -1;
        System.out.println("\nВведите позицию");
        if (scanner.hasNextInt()) {
            position = scanner.nextInt();
        } else {
            System.out.println("Позиция не может быть буквой, символом, или не целым числом");
            System.exit(0);
        }
        System.out.println("Переданный массив: " + Arrays.toString(array));

        //Если позиция введена и она в ренже, то выполняю метод с позицией, если нет то без
        if (position < 0 || position >= size) {
            ArrayFillingLogic.arrayPopulation(array, value);
            System.out.println("Меняем первый символ массива на " + (array[0]) + "\nВесь массив: " + Arrays.toString(array));
        } else {
            ArrayFillingLogic.arrayPopulation(array, value, position);
            System.out.println("Ставим ввёдённое значение на место №: " + (position + 1) + "\nПолученный массив: " + Arrays.toString(array));
        }
    }
}




