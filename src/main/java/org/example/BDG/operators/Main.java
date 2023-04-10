package org.example.BDG.operators;

public class Main {
    public static void main(String[] args){
        task1();task2();task3();task4();task5();task6();task7();task8();task9();
        //10
        int result = task10(100);
        //1 Shift
        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);
        System.out.println(" ");
        //2 Shift
        int num = 5;
        int xc = num << 3;
        int cx = num << 4;
        System.out.println(xc);
        System.out.println(cx);
    }
    public static void task1(){
        int a=8;
        int b=6;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a-b);
        System.out.println(a%b);
        System.out.println(" ");
    }
    public static void task2(){
        double c = 6.4;
        double d = 0.03;
        System.out.println(c+d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c - d);
        System.out.println( c % d);
    }
    public static void task3(){
        int x = 2*((5+3) * 4-8);
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println("Answer x is " + x);
        System.out.println("Answer y is " + y);
        System.out.println(" ");
    }
    public static void task4(){
        //unary operators
        int e = 10;
        int f = -88;
        boolean n1= true;
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e +92);
        System.out.println(!n1);
        System.out.println(n1);
        System.out.println(e++);
        System.out.println(--f);
        System.out.println("and");
        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        System.out.println(" ");
    }
    public static void task5(){
        //Assignment operator
        int x = (int)1.0;
        short y = (short)1921222;
        System.out.println(x);
        System.out.println(y);
        System.out.println(2147483647+1 + "\n");
    }
    public static void task6(){
         int aa = 10, bb = 20;
         System.out.println(aa<bb);
         System.out.println(aa<=bb);
         System.out.println(aa>=bb);
         System.out.println(aa>bb);
        System.out.println(" ");
    }
    public static void task7(){
        float y = 2.1f;
        byte x = 5;
        byte y1 = 10;
        byte z = (byte) (x+y1);
        short x1 = 10;
        short y2 = 3;
        short z1 = (short) (x1*y2);
        long x2 = 10;
        int y3 = 5;
        x2 = y3*x2;
        System.out.println(z);
        System.out.println(z1);
        System.out.println(x2+"\n");
    }
    public static void task8(){
        int x = 10;
        int y = 4;
        int z = x;
        x=y;
        y=z;
        System.out.println(x);
        System.out.println(y+"\n");
    }
    public static void task9(){
        int x = 5;
        int y = 2;
        x= x+y;
        y = x-y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }
    public static int task10(int x){
        int result = 0;
        for (int i = 1; i < x; i++) {
            result = i;
            System.out.println(result);

        }
        return result;
    }
    //Bitwise & Logical Operators
    }

