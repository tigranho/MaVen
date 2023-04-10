package org.example.BDG.arrays;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Scanner;
class Main {
    //4
    static float arr[] = {10, 14, 2, 510, 12};

    static float Smaller() {
        int i;
        float min = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }
    @Test
    public static void main(String[] args) {
        test2();test11();
        test3();test14();
        test5();test6();test7();
        test8();test9();test10();
        int[] numbers = {21, 9, -7, -4, -3, 12, -16};
        for (int x : test1(numbers)) {
            System.out.println(x);
        }
        //4
        System.out.println("Largest in given array is " + Smaller());
    }
    @Test
    public static int[] test1(int[] num) {
        int count = 0;
        for (int x : num) {
            if (x > 0) {
                count++;
            }
        }
        int[] nums = new int[count];
        int i = 0;
        for (int n : num) {
            if (n > 0) {
                nums[i] = n;
                i++;
            }
        }
        return nums;
    }
    @Test
    public static void test2() {
        int[] numbers = {2, 5, 7};
        System.out.println("Риверсировать числа: 257");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "");
        }
    }
    @Test
    public static void test3(long... l) {
        long maxElement = Long.MIN_VALUE;
        for (int i = 0; i < l.length; i++) {
            if (l[i] > maxElement) {
                maxElement = l[i];
            }
        }
        System.out.println("Самый большой элемент массива: " + maxElement);
    }
    @Test
    public static void test5() {
        int[] n = {5, 4, 3, 2, 1};
        int[] m = new int[n.length - 1];
        System.arraycopy(n, 0, m, 0, n.length - 1);
        System.out.println("Исходный массив: ");
        for (int i = 0; i < n.length; i++)
            System.out.print(n[i] + " ");
        System.out.println("После копирования содержимое скопированного массива будет следующим:");
        for (int i = 0; i < m.length; i++)
            System.out.print(m[i] + " ");
    }
    @Test
    public static void test6() {
        int[] a = {1, 32, 12, 7};
        int[] b = {2, 12, 31, 54};
        int size = a.length;
        for (int i = 0; i <= size - 1; i++) {
            System.out.println(a[i] + b[i]);
        }
    }
    @Test
    public static void test7() {
        int[] a = {1, 32, 12, 7};
        int[] b = {2, 12, 31, 54};
        int size = a.length;
        for (int i = 0; i <= size - 1; i++) {
            System.out.println(a[i] + b[i]);
        }
    }
    @Test
    public static void test8() {
        int[] arr = {21, 3, 4, 3, 2, 3, 56, 23};
        for (int i = 0; i < arr.length; ++i) {
            int x = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; ++j) {
                if (arr[j] == x) {
                    ++count;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
    @Test
    public static void test9(){
        int [] x = new int[]{12,41,31,4,15};
        int y;
        for (int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }
        for (int i=0; i<x.length; i++){
            for (int j=i; j< x.length; j++){
                if (x[i]> x[j]){
                    y = x[i];
                    x[i] = x[j];
                    x[j]= y;
                }
            }
        }
        for (int a: x){
            System.out.println(a);
        }
    }
    @Test
    public static void test10(){
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        if (num >= 1 && num <= 200) {
            int[] arr = new int[num];
            x.nextLine();
            String line = x.nextLine();
            String[] str1 = line.split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(str1[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    @Test
    public static void test11(){
        int x[] = {21,0,1,4,0,2,6,0,1,0};
        int y = x.length;
        int count = 0;
        for (int i= 0; i<y; i++){
            if(x[i] !=0){
                x[count++] = x[i];
                System.out.println(x[i]);
            }
        }
    }
    @Test
    public static void test14(){
        int array[][] = {
                {2, 8, 1, 3},
                {6, 1, 4, 1},
                {4, 5, 2, 5},
                {9, 3, 6, 8},
        };
        int i, j;
        {
            for (i = 0; i <4; i++) {
                for (j = 0+i; j < 4; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}


