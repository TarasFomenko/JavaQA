package Lesson4HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Lesson4HW3 {
    public static void main(String[] args) {
        //Тут я нашёл рандомайзер для массива, чтобы самому вручную не вводить нагуглил
        int size = 20;
        int upperBound = 70;
        int[] array = new int[size];
        Random random = new Random();
        IntStream.range(0, size).forEach(index -> array[index] = random.nextInt(upperBound));
        System.out.println("Рандомный массив: "+ Arrays.toString(array));

        //В конце задания я понял, что у меня только положительные цифры и поэтому я решил отнимать половину от верхней границы
        for (int i = 0; i < array.length;i++){
            array[i] = array[i]- 35;
        }
        System.out.println("Рандомный массив с отрицательными значениями: "+ Arrays.toString(array));

        //Тут я суммирую, а вывожу в конце - так красивее
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5 && array[i] < 45) {
                sum = sum + array[i];
            }
        }

        //Тут я вывожу положительные числа
        int number =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && (array[i]%2 ==0 )) {
                //Решил добавить номер кажлого положительного числа
                number = number+1;
                System.out.println("Положительное число #"+ number+ ": " + array[i]);
            }
        }
        System.out.println("Сумма всех чисел массива, которые выполняют условие: " + sum);
    }
}