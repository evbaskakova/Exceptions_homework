package hw_02; // Задача 2:
//Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
//Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с
//сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить результат деления.
//Обратите внимание, что в обоих задачах используются собственные исключения, которые наследуются от класса Exception.
//Это позволяет нам определить специфическую причину ошибки и передать информацию об ошибке для последующей обработки.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("Введите второе число: ");
        double b = Double.parseDouble(sc.nextLine());
        try{
            System.out.printf("Результат деления: %f", divide(a, b));
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
    public static double divide(double a, double b) throws DivisionByZeroException {
        if(b == 0)throw new DivisionByZeroException("Деление на ноль недопустимо");
        return a/b;
    }
}
