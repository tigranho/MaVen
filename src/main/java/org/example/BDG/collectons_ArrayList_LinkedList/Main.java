package org.example.BDG.collectons_ArrayList_LinkedList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();test8();test9();test10();test11();test12();test13();test14();test15();test16();test17();test18();test19();test20();test21();
    }

    public static void test1() {
        ArrayList<String> fList = new ArrayList<>();
        fList.add("123");
        fList.add("Sky");
        fList.add("Weather");
        fList.add("Show");

        for (String s : fList) {
            System.out.println(s);
        }
    }

    public static void test2() {
        ArrayList<String> newList = new ArrayList<>();
        newList.add("123");
        newList.add("Sky");
        newList.add("Weather");
        newList.add("Show");
        System.out.println("\nСписок до изменения" + newList);
        newList.add(0, "sylence");
        System.out.println("Список после изменения" + newList);

    }

    public static void test3() {
        ArrayList<String> sList = new ArrayList<>();
        sList.add("123");
        sList.add("Sky");
        sList.add("Weather");
        sList.add("Show");
        System.out.println("\nСписок до изменения" + sList);
        byte index = 2;
        String indexOfelement = "Light ";
        sList.set(index, indexOfelement);
        System.out.println("После изменения " + sList);
    }

    public static void test4() {
        ArrayList<String> bList = new ArrayList<>();
        bList.add("123");
        bList.add("Sky");
        bList.add("Weather");
        bList.add("Snow");
        String ToFind = "Snow";
        int index = bList.indexOf(ToFind);
        if (index == -1) {
            System.out.println("Элемент " + ToFind + " не найден в списке.");
        } else {
            System.out.println("Элемент " + ToFind + " найден в списке на позиции " + index);
        }
    }

    public static void test5() {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("123");
        firstList.add("Sky");
        firstList.add("Weather");
        firstList.add("Snow");
        //копирование
        ArrayList<String> secondList = new ArrayList<>(firstList);
        System.out.println("firstList: " + firstList);
        System.out.println("\nSecondList: " + secondList);
    }

    public static void test6() {
        ArrayList<String> s = new ArrayList<>();
        s.add("123");
        s.add("Sky");
        s.add("Weather");
        s.add("Snow");
        Collections.reverse(s);
        System.out.println("\nОбратный список" + s);
    }

    public static void test7() {
        ArrayList<String> elist = new ArrayList<>();
        elist.add("123");
        elist.add("Sky");
        elist.add("Weather");
        elist.add("Snow");
        Collections.swap(elist, 0, 2);
        System.out.println("\nИзмененый вид" + elist);

    }

    public static void test8() {
        ArrayList<String> Empty = new ArrayList<>();
        if (Empty.isEmpty()) {
            System.out.println("\nпусто");
        } else {
            System.out.println("\nполный список");
        }
    }

    public static void test9() {
        ArrayList<String> large = new ArrayList<>();
        large.add("123");
        large.add("Sky");
        large.add("Weather");
        large.add("Snow");
        System.out.println("\nРазмер по-умолчанию" + large);
        large.ensureCapacity(7);
        System.out.println("\nНовый размер " + large.size());
        System.out.println("\n");
    }

    public static void test10() {
        ArrayList<String> linked = new ArrayList<>();
        linked.add("123");
        linked.add("Sky");
        linked.add("Weather");
        linked.add("Snow");
        for (String element : linked)
            System.out.println(element);
    }

    public static void test11() {
        System.out.println("\nПока что не знаю\n");

    }

    public static void test12() {
        LinkedList<String> begin = new LinkedList<>();
        begin.addFirst("123");
        begin.addFirst("Sky");
        begin.addLast("Weather");
        begin.addLast("Snow");
        System.out.println("Связанный список: " + begin);
    }

    public static void test13() {
        LinkedList<String> L = new LinkedList<>();
        L.add("123");
        L.add("Sky");
        L.add("Weather");
        L.add("Snow");
        System.out.println("\nBefore insert the specified " + L);
        L.addLast("Ground");
        System.out.println("After " + L);

    }

    public static void test14() {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("123");
        myList.add("Sky");
        myList.add("Weather");
        myList.add("Snow");
        String firstEl = myList.removeFirst();
        System.out.println("\nУдаление первого элемента " + firstEl);
        String second = myList.removeLast();
        System.out.println("Удаление последнего элемента " + second);
        System.out.println("Конечный результат " + myList);
    }

    public static void test15() {
        LinkedList<String> dodo = new LinkedList<>();
        dodo.add("123");
        dodo.add("Sky");
        dodo.add("Weather");
        dodo.add("Snow");
        LinkedList<String> clone = (LinkedList<String>) dodo.clone();
        System.out.println("\nОригинал " + dodo);
        System.out.println("Клон " + clone);
    }

    public static void test16() {
        LinkedList<String> em = new LinkedList<>();
        em.add("123");
        em.add("Sky");
        em.add("Weather");
        em.add("Snow");
        if (em.isEmpty()) {
            System.out.println("\nLinked isa emprty");
        } else {
            System.out.println("Linked is not empty");
        }
    }

    public static void test17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите число ");
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            arrayList.add(num);
        }
        int sum = 0;
        for (int num : arrayList) {
            sum += num;
        }
        double medium = (double) sum / arrayList.size();
        System.out.println("Sum " + sum);
        System.out.println("Medium num " + medium);
    }

    public static void test18() {
        ArrayList<Integer> sorter = new ArrayList<>();
        sorter.add(2);
        sorter.add(4);
        sorter.add(1);
        sorter.add(15);
        sorter.add(123);
        sorter.add(5);
        Collections.sort(sorter);
        System.out.println("\nСортировка по возрастанию");
        for (int num : sorter) {
            System.out.println(num);
        }
    }

    public static void test19() {
        ArrayList<Integer> negative = new ArrayList<>();
        negative.add(-2);
        negative.add(4);
        negative.add(-1);
        negative.add(15);
        negative.add(-123);
        negative.add(5);
        for (int i = 0; i < negative.size(); i++) {
            if (negative.get(i) < 0) {
                negative.remove(i);
                i--;
            }
        }
        System.out.println("\nОбновленная последовательность ");
        for (int num : negative)
            System.out.println(num);
    }

    public static void test20() {
        ArrayList<Integer> occur = new ArrayList<Integer>();
        occur.add(4);
        occur.add(2);
        occur.add(2);
        occur.add(5);
        occur.add(2);
        occur.add(3);
        occur.add(2);
        occur.add(3);
        occur.add(1);
        occur.add(5);
        occur.add(2);
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        for (int num : occur) {
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        for (int i = 0; i < occur.size(); i++) {
            int num = occur.get(i);
            if (freq.get(num) % 2 != 0) {
                occur.remove(i);
                i--;
            }
        }
        System.out.println("Обновленное число");
        for (int result : occur) {
            System.out.println(result);
        }
    }
    //21
    public static class Stack<T>{
        private ArrayList<T> items;
            public Stack(){
                items=new ArrayList<T>();
        }
        public void push(T item){
                items.add(item);
        }
        public T pop(){
                if (isEmpty()){
                    throw new IllegalStateException("Stack пустой");
                }
                return items.remove(items.size()-1);
        }
        public boolean isEmpty(){
                return items.isEmpty();
        }
    }
    public static void test21() {
        Stack<Integer> stackOfIntegers = new Stack<>();
        stackOfIntegers.push(1);
        stackOfIntegers.push(2);
        stackOfIntegers.push(3);
        System.out.println("\n");
        System.out.println(stackOfIntegers.pop());
        System.out.println(stackOfIntegers.pop());
        System.out.println(stackOfIntegers.pop());
        System.out.println(stackOfIntegers.isEmpty());
        //помог чатGpt
    }
}