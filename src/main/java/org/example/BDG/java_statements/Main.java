package org.example.BDG.java_statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.print("ВВедите четное или нечетное");
        int e = scanner.nextInt();
        System.out.println(test1(e));
        // 2
        System.out.print("Введите целое число ");
        int x = scanner.nextInt();
        System.out.println(test2(x));
        // 3
        System.out.print("Введите второй пример");
        int y = scanner.nextInt();
        System.out.println(test3(y));
        // 4
        System.out.print("Введите третий пример");
        int z = scanner.nextInt();
        System.out.println(test4(z));
        // 5
        System.out.print("Введите трехзначное целое число:");
        int n = scanner.nextInt();
        System.out.println(test5(n));
        //7
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();
        int max = test7(num1, num2, num3);
        System.out.println("Наибольшее число: " + max);
        System.out.println("  \n");
        //9
        test9();
        System.out.println("\n");
        test10();
        System.out.println("\n");
        //11
        System.out.println(test11());
        //12
        System.out.println("Введите число ");
        int s = scanner.nextInt();
        System.out.println(test12(s));
    }

    //1
    public static String test1(int x) {
        if (x % 2 == 0) {
            return x + "четное";
        } else {
            return x + "нечетное";
        }
    }

    // 2
    public static String test2(int x) {
        if (x > 0) {
            return x + "позитивный";
        } else if (x < 0) {
            return x + "негативное";
        } else {
            return x + "нейтральное";
        }
    }

    // 3
    public static String test3(int x) {
        if ((x > 5 && x < 8) || (x > 15 && x < 20)) {
            return x + "между 5 и 8, или между 15 и 20";
        } else {
            return x + "дальше 5 и 8 и 15 - 20";
        }
    }

    // 4
    public static String test4(int x) {
        if (x % 5 == 0 && x % 7 == 0) {
            return x + "делится и на 5 и на 7";
        } else {
            return x + " не делится на 5 и на 7";
        }
    }

    // 5
    public static String test5(int x) {
        int Second = (x / 10) % 10;
        if (Second == 7) {
            return "Первая цифра" + x + " это 7";
        } else {
            return "Вторая цифра " + x + " не 7";
        }
    }

    //7
    public static int test7(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = z;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
    public static void test9(){
        int x = 0;
        while (x++<10){
            x++;
        }
        System.out.println(x);
    }
    public static void test10(){
        int x = 2;
        int y = 5;
        while(y < 10) {
            y++;
            x++;
            System.out.println(y+ " " + x);
        }
    }
    public static int test11(){
        for (int i = 1; i<= 200; i++);
        return 0;
    }
    public static int test12(int x){
        while (x >= 10)
            x /= 10;
        return x;
    }
}