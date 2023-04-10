package org.example.BDG.collections_Queue_Dqueue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test7();
        test8();
        test9();
        test12();
        test13();
        test14();
        test15();
    }

    public static void test1() {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        int massive = queue.poll();
        System.out.println(massive);
        System.out.println(queue);
    }

    public static void test2() {
        LinkedList<Integer> qu = new LinkedList<>();
        qu.addFirst(1);
        qu.addLast(2);
        qu.addLast(3);
        qu.addFirst(4);
        System.out.println(qu);
        int first = qu.removeFirst();
        int last = qu.removeLast();
        System.out.println(" \n");
        System.out.println(first);
        System.out.println(last);
        System.out.println(qu);
    }
    public static void test3() {
        PriorityQueue<Integer> dq = new PriorityQueue<>();
        dq.add(4);
        dq.add(1);
        dq.add(3);
        dq.add(2);
        System.out.println("\n");
        System.out.println(dq);
        int element = dq.poll();
        System.out.println(element);
        System.out.println(dq);
    }
    public static void test4() {
        PriorityQueue<String> four = new PriorityQueue<>();
        four.add("John");
        four.add("Snow");
        four.add("White");
        four.add("Wolf");
        System.out.println("\n" + four);
        String element = four.poll();
        System.out.println(element);
        System.out.println(four);
    }
    public static void test5() {
        ArrayDeque<Integer> arrd = new ArrayDeque<>();
        arrd.addFirst(1);
        arrd.addLast(2);
        arrd.addFirst(3);
        System.out.println("\n" + arrd);
        int first = arrd.removeFirst();
        int last = arrd.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(arrd);
    }
    public static void test7() {
        Queue<Integer> rem = new LinkedList<>();
        rem.add(5);
        rem.add(10);
        rem.add(15);
        rem.add(20);
        rem.add(25);
        System.out.println("\n");
        while (!rem.isEmpty()) {
            int element = rem.remove();
            System.out.println("Удаление элементов " + element);
        }
    }
    public static void test8() {
        Deque<Integer> rev = new ArrayDeque<>();
        rev.add(5);
        rev.add(10);
        rev.add(15);
        rev.add(20);
        rev.add(25);
        System.out.println("\n");
        while (!rev.isEmpty()) {
            int element = rev.removeLast();
            System.out.println(element);
        }
    }
    public static void test9() {
        Queue<Integer> que = new LinkedList<>();
        que.add(5);
        que.add(10);
        que.add(15);
        que.add(20);
        que.add(25);
        int element = 10;
        System.out.println("\n");
        if (que.contains(element)) {
            System.out.println("Элеммент есть в очереди" + element);
        } else {
            System.out.println("Элеммента нет в очереди " + element);
        }
    }
    public static void test12() {
        PriorityQueue<String> str = new PriorityQueue<>();
        str.add("red");
        str.add("black");
        str.add("green");
        str.add("yellow");
        str.add("blue");
        while (!str.isEmpty()){
            System.out.println(str.remove());
        }
    }
    public static void test13(){
        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(2);
        number.add(4);
        number.add(1);
        PriorityQueue<Integer> number2 = new PriorityQueue<>();
        number2.addAll(number);
        while (!number2.isEmpty()){
            System.out.println(number2.remove());
        }
    }
    public static void test14(){
        Queue<String> sql = new LinkedList<>();
        sql.add("one");
        sql.add("two");
        sql.add("three");
        System.out.println("\n");
        String element = sql.poll();
        System.out.println("Первый элеммент " +element);
        System.out.println("Оставшиеся элемменты"+sql);
    }
    public static void test15(){
        PriorityQueue<Integer> sq= new PriorityQueue<>();
        sq.add(2);
        sq.add(1);
        sq.add(5);
        sq.add(3);
        System.out.println("\n");
        System.out.println(sq);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(sq);
        System.out.println("Максимальное значение" +pq);
    }
}