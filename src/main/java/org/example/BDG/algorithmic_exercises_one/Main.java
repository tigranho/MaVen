package org.example.BDG.algorithmic_exercises_one;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        test2();
        test3();
        test4();
        //4
        Random random = new Random();
        int smallest = 100;
        int largest = 0;
        int count = 0;
    }

    public static void test2() {
        System.out.println("Ввести число");
        Scanner in = new Scanner(System.in);
        int n = (int) in.nextLong();
        int number = n;
        int largestPrimeFactor = n;
        int i = 2;
        while (i <= n && n != 1) {
            if (n % i == 0) {
                n = n / i;
                largestPrimeFactor = i;
            } else {
                i = i + 1;
            }
        }
        System.out.println("Больший делитель числа  " + number + " это = " + largestPrimeFactor);
    }

    public static void test3() {
        int x = 0;
        int y = 100;
        int z = x + (int) (Math.random() * y);
        System.out.println("Случайное число " + z);
        if ((z % 2) == 0) {
            System.out.println("Число " + z + " четное ");
        } else {
            if (z % 1 == 0) {
                System.out.println("Число " + z + " нечетное ");
            }
        }
    }

    public static void test4() {

    }
}


