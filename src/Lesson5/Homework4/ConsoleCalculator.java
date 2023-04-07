package Lesson5.Homework4;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        String operation = "";

        //Тут я добавил проверки чтобы если мы ввели не инт, программа заканчивалась
        System.out.println("Введите число 1");
        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
        } else {
            System.out.println("Ввёденный символ не является целочисленным числом");
            System.exit(0);
        }

        //Тоже проверки
        System.out.println("Введите число 2");
        if (scanner.hasNextInt()) {
            number2 = scanner.nextInt();
        } else {
            System.out.println("Ввёденный символ не является целочисленным числом");
            System.exit(0);
        }

        // Тут если у нас есть ноль в 1ом или 2ом числе, то заканчиваем программу
        System.out.println("Введите операцию");
        if (scanner.hasNext("/") && number1 == 0 || number2 == 0) {
            System.out.println("Деление нуля или на ноль невозможно");
            System.exit(0);
        }
        else   {
            operation = scanner.next();
        }
        switch (operation) {
            case "+":
                System.out.println(CalculatorLogic.add(number1, number2));
                break;
            case "-":
                System.out.println(CalculatorLogic.subtract(number1, number2));
                break;
            case "*":
                System.out.println(CalculatorLogic.multiply(number1, number2));
                break;
            case "/":
                System.out.println(CalculatorLogic.divide(number1, number2));
                break;
            case "%":
                System.out.println(CalculatorLogic.modulo(number1, number2));
                break;
            //Проверяю на неправильный знак
            default:
                System.out.println("Знак введён неправильно");
        }
    }
}
