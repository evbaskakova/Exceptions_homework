package hw_01;//Задача 1:
//Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным
//Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с
//сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = Integer.parseInt(sc.next());
        try{
            throwIfNumberIsNegative(number);
            System.out.println("Число корректно");
        }
        catch (InvalidNumberException e){
            System.out.println(e.getMessage());
        }
    }
    public static void throwIfNumberIsNegative(int n) throws InvalidNumberException {
        if(n < 0)throw new InvalidNumberException("Некорректное число");
    }
}