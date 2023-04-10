package org.example.BDG.primitive_data_types;

public class Main {
    public static void main(String[] args) {
        task1();task2();task3();task4();task5();task6();task7();task11_1();task11_2();
        task8();task9();task10();task12();task13();task14();task15();task16();task17();task18();
}
public static void task1(){
            int a=5, b=6, sum;
            sum = a+b;
            System.out.println("a+b=" +sum);
    }
    public static void task2(){
        short c = 122;
        short d = 136;
        System.out.println(c);
        System.out.println(d);
        System.out.println("\n");
    }
    public static void task3(){
        int e = 12;
        int f = 16;
        System.out.println(e);
        System.out.println(f);
        System.out.println("\n");
    }
    public static void task4(){
        long g = 1337675713;
        long h = 92123233;
        System.out.println(g);
        System.out.println(h);
        System.out.println("\n");
    }
    public static void task5(){
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println("\n");
    }
    public static void task6(){
        float j = 0.3f;
        float k = 0.41f;
        System.out.println(j);
        System.out.println(k);
    }
    public static void task7(){
        double l = 5;
        double m = 4;
        System.out.println(l);
        System.out.println(m);
    }
    public static void task8(){
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }
    public static void task9(){
        float x = 3456.091f;
        float y = 12.345f;
        double z = 34.567839023;
        double h = 8923.1234857;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(h);
    }
    public static void task10(){
        char n = 'a';
        char o = 'x';
        System.out.println(n);
        System.out.println(o);
    }
    public static void task11_1(){
        char s = 77;
        char w = 109;
        System.out.println(s);
        System.out.println(w);
    }
    public static void task11_2(){
        char t = 57;
        System.out.println(t);
    }
    public static void task12(){
        boolean p = 2 < 3;
        boolean q = 2>3 ;
        System.out.println(p);
        System.out.println(q);
    }
    public static void task13(){
        long year1 = 201L;
        System.out.println(year1);
    }
    public static void task14(){
        int aa = 7;
        long bb = 1L;
        bb = (long) aa;
        System.out.println("Значение переменной bb: " + bb);
    }
    public static void task15(){
        int myInt = 7;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
    }
    public static void task16(){
        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println(dd);
        System.out.println(ii);
    }
    public static void task17(){
        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println(ff);
        System.out.println(gg);
    }
    public static void task18(){
         /*Գտնել սխալը  եւ ուղղել.
         long max = 3123456789;
           double d = 1000_.00;
            char i =’i’; char j=’j’; char ij = i +j;
             int 7a = 8;//we can't use a number in type (int)
              long h = h  + 8;
               int n, m = 11; m = n;  */
        double d = 1000.00;
        char i ='i';
        char j= 'j';
        char ij = (char) (i+j);
        int a = 9;
        long h = (long) +8;
        int n = 11;
        int m = n;
        System.out.println(d);
        System.out.println(ij);
        System.out.println(a);
        System.out.println(h);
        System.out.println(m);
    }
}
