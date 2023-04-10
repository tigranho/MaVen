package org.example.BDG.methods;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int result = test1(x, y);
        System.out.println("Результат: " + result);
        test2();
        test3();
        //4
        char c = 'a';
        char resu = returnChar(c);
        System.out.println(resu);
        //5
        System.out.println(test5('x', 'b'));
        //6
        int xz = test6(6);
        System.out.println(xz);
    }

    public static int test1(int a, int b) {
        return 0;
    }

    public static void test2() {
        System.out.println("Этот метод не принимает параметр и ничего не возвращает");
    }

    public static void test3() {
        boolean print = true;
        if (print) {
            System.out.println("Hello World");
        }
    }

    public static char returnChar(char c) {
        return c;
    }

    public static float test5(float x, float b) {
        x = 5.5f;
        b = 3.0f;
        return x;
    }

    public static int test6( int z) {
        if (z > 0) {
            return z + test6(z - 1);
        } else {
            return 0;
        }
    }
}
