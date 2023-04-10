package org.example.BDG.string_stringbuilder;

public class Main {
    public static void main(String[] args) {
        String x = "hello";
        String y = "world";
        System.out.println("\"hello\"" + "," + "\"world\"");
        System.out.println("1, 2," + "\"hello\"");
        System.out.println("\"1\"," + "2," + "\"hello");
        System.out.println("\"hello\"," + 1 + "," + 2 + "," + "\"world\"");
        test2();test5();test9();test10();
        test3();test7();test8();test12();
    }

    public static void test2() {
        String x = "\nWe \nare \nliving \nin";
        System.out.println(x);
    }

    public static void test3() {
        String x = "sample";
        StringBuilder sb = new StringBuilder(x);
        System.out.println(sb.reverse());
    }

    public static void test5() {
        String word = "Hello World";
        System.out.println(word.toUpperCase());
    }
    public static void test7(){
        String word =  "We are living in an yellow submarine. We don't  have anything";
        String newWord = word.replaceAll("a", "");
        System.out.println(newWord);
    }
    public static void test8(){
        String word = "We are living in an yellow submarine. We don't  have anything";
        String  newWord = word.replaceAll("a", "*");
        System.out.println(newWord);
    }
    public static void test9(){
        String word = "We are living in an yellow submarine. We don't  have anything";
        String newWord= word.substring(27,35);
        System.out.println(newWord);
    }
    public static void test10(){
        String word = "We are living in an yellow submarine. We don't  have anything";
        int newWord = word.indexOf("a");
        System.out.println(newWord);
    }
    public static void test12(){
        String s1 = "";
        boolean s2 = true;
        System.out.println(s2);
    }
}
