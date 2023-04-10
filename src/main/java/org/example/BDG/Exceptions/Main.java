package org.example.BDG.Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1
        try {
            System.out.println("Enter the number");
            int number = sc.nextInt();
            int reverse = 1/number;
            System.out.println("обратное значение " +reverse);
        }catch (ArithmeticException e){
            System.out.println(" нельзя делить на ноль ");
        }
        //2
        try {
            System.out.println("Введите размер массива: ");
            byte size = sc.nextByte();
            byte[] array = new byte[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Введите" + (i + 1) + " элемент массива: ");
                array[i] = sc.nextByte();
            }
            byte sum = 0;
            for (int i = 0; i < size; i++) {
                sum += array[i];
            }
            System.out.println("\nСумма элементов массивов: " + sum);
        }catch (Exception e){
            System.out.println("\nПри ошибке:" + e.getMessage());
        }
        //3
        try {
            System.out.println("Введите первое целое число: ");
            int number = sc.nextInt();
            System.out.println("Введите второе целое число: ");
            int number2 = sc.nextInt();
            if(number2==0){
                throw new Exception("Нельзя делить на ноль");
            }
            int rez = number/number2;
            System.out.println("Ответ:" +rez);
        }catch (Exception e){
            System.out.println("Ошибка: " +e.getMessage());
        }
        //5
        try {
            System.out.println("Введите целое число: ");
            int num = sc.nextInt();
            if(num<0){
                throw new Exception("Недопустимое значение");
            }
            double sqr = Math.sqrt(num);
            System.out.println("Квадратный корель "+num+sqr);
        }catch (Exception e){
            System.out.println("При ошибке"+ e.getMessage());
    }finally {
            System.out.println("Good bye");
        }
        //7

    }
}