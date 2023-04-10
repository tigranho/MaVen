package org.example.BDG.algorithmic_exercises_two;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        test6();test7();test11();test12();
        //8
        int n1 = 1;
        int n2 = 500;
        ArmstrongNum(n1, n2);
      System.out.println();
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.print("Введите положительное целое число: ");
        int num = scanner.nextInt();
        System.out.println("Таблица умножения для числа " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        //2
        System.out.println("Ввести основание степени ");
        int a = scanner.nextInt();
        System.out.println("Ввести показатель степени ");
        int b = scanner.nextInt();
        int result = 1;
        for (int i = 1; i<b; i++){
            result*= a;
        }
        System.out.println(b + "в степени"+ b+"=" + result);
        //3
        Scanner in = new Scanner(System.in);
        System.out.println("Ввести число");
        int number = in.nextInt();
        int reversed = 0;
        for(;number != 0; number /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Риверсия числа " + reversed);
        //4
        System.out.println("Ввести число");
        int numm = in.nextInt();
        boolean aa = true;
        for (int i = 2; i < numm; i++) {
            if(numm%i==0)
            {
                aa = false;
                break;
            }
        }
        if (aa) {
            System.out.println("Число: " +numm+ " простое");
        }else {
            System.out.println("Число: " +numm+ " не является простым");
        }
        //5
        String answer;
        do {
            System.out.println("Введите число");
            int x = in.nextInt();
            int z = in.nextInt();
            int y = x * z;
            System.out.println(y);
            System.out.println("Хотите продолжить операцию? Да/Нет");
            answer = in.next();
        }
        while(answer.equals("Да"));
        System.out.println("Тогда прощайте");
    }
    @Test
    public static void test6(){
        Scanner x = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;
        for (int i = 1; i>0; i++) {
            System.out.println("Ввести число ");
            int num = x.nextInt();
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
            else
                zero++;
            System.out.println("Введите 0 для выхода и любую цифровую клавишу для продолжения входа");
            int choice = x.nextInt();
            if (choice==0)
                break;
        }
        System.out.println("Положительное число %d" + pos);
        System.out.println("Негативное число %d" + neg);
        System.out.println("Нулевое число %d" + zero);
        x.close();
    }
    @Test
    public static void test7(){
        Scanner console = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;
        do{
            System.out.print("Введите число ");
            number = console.nextInt();
            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }
            System.out.print("Хотите продолжить? Да/Нет? ");
            choice = console.next().charAt(0);
        }while(choice=='Д' || choice == 'д');
        System.out.println("Largest number: " + max);
    }
    @Test
    static void ArmstrongNum(int l, int h) {
        for (int j = l + 1; j < h; ++j) {
            int y = j;
            int x = 0;
            while (y != 0) {
                y /= 10;
                ++x;
            }
            int sum_power = 0;
            y = j;
            while (y != 0) {
                int d = y % 10;
                sum_power += Math.pow(d, x);
                y /= 10;
            }
            if (sum_power == j)
                System.out.print(j + " ");
        }
    }
    @Test
    public static void test11(){
        Random rand = new Random();
        int numberToGuess =rand.nextInt(10);
        Scanner input=new Scanner(System.in);
        int guess;
        boolean win =false;
        while (win == false)
            System.out.println("Прошу, не выгоняйте меня!!!!!!");
        guess = input.nextInt();{
            if(guess == numberToGuess)
                win=true;}
        if(guess<numberToGuess) {
            System.out.println("Не молодец");
        }
        {
            if (guess > numberToGuess)
                System.out.println("Молодец");
            System.out.println("Красаучег ты выиграл ");
            System.out.println("Число было"  +numberToGuess);
        }
    }
    @Test
    public static void test12(){

        System.out.println("**********\n**********\n**********\n**********");
        System.out.println("*\n**\n***\n****\n*****");
        System.out.println("    *\n   **\n  ***\n ****\n*****");
        System.out.println("    *\n   ***\n  *****\n *******\n*********");
        System.out.println("    1\n   222\n  33333\n 4444444\n555555555");
        System.out.println("    1\n   212\n  32123\n 4321234\n543212345");
        System.out.println("Пожалуйста не отчисляйте меня");
    }
}





