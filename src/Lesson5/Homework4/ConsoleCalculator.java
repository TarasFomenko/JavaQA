package Lesson5.Homework4;

import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        String operation = "";

        System.out.println("Введите число 1");
        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
        } else {
            System.out.println("Ввёденный символ не является целочисленным числом");
            System.exit(0);
        }

        System.out.println("Введите число 2");
        if (scanner.hasNextInt()) {
            number2 = scanner.nextInt();
        } else {
            System.out.println("Ввёденный символ не является целочисленным числом");
            System.exit(0);
        }

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
            default:
                System.out.println("Знак введён неправильно");
        }
    }
}
