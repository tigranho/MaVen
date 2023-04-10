package org.example.BDG.hashSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    //Hash 1 A B C
    public static void main(String[] args) {
        hashA();
        hashC();
        hash2A();
        hash2B();
        TreeSet1();
        TreeSet2();
        TreeSet3();
        //Сделал 3 из 5
    }

    public static void hashA() {
        HashSet<Integer> one1 = new HashSet<>();
        one1.add(2);
        one1.add(4);
        one1.add(5);
        HashSet<Integer> two2 = new HashSet<>();
        two2.add(4);
        two2.add(5);
        two2.add(1);
        one1.retainAll(two2);
        System.out.println(one1);
    }

    public static void hashC() {
        HashSet<String> set = new HashSet<>();
        set.add("Gagik");
        set.add("RAFIK");
        set.add("Tigran");
        set.add("Robert");
        HashSet<String> set2 = new HashSet<>();
        for (String word : set) {
            set2.add(word.toLowerCase());
        }
        System.out.println(set2);
    }

    public static void hash2A() {
        LinkedHashSet<Integer> hash = new LinkedHashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(4);
        hash.add(6);
        hash.add(5);
        System.out.println("До изменения " + hash);
        hash.removeIf(number -> number % 2 == 0);
        System.out.println("После" + hash);
    }

    public static void hash2B() {
        LinkedHashSet<Person> person = new LinkedHashSet<Person>();
        person.add(new Person("Gagik", 20));
        person.add(new Person("Ara", 17));
        person.add(new Person("Rafik", 23));
        LinkedHashSet<Person> sort = new LinkedHashSet<>();
        sort.addAll(person);
        sort.stream().sorted(Comparator.comparing(Person::getAge)).forEach(System.out::println);
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String toString() {
            return "\nPerson{" + "name is " + name + " " + " age " + age + '}';
        }
    }

    public static void TreeSet1() {
        TreeSet<Person2> tree = new TreeSet<>(Comparator.comparingInt(Person2::getAge));
        tree.add(new Person2("Gag", 20));
        tree.add(new Person2("Ara", 17));
        tree.add(new Person2("Tigran", 29));
        for (Person2 person : tree) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }

    public static class Person2 {
        private String name;
        private int age;

        public Person2(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void TreeSet2() {
        TreeSet<String> set1 = new TreeSet<>();
        TreeSet<String> set2 = new TreeSet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        set2.add("2");
        set2.add("3");
        set2.add("4");
        HashSet<String> res = new HashSet<>(set1);
        res.removeAll(set2);
        System.out.println(res);
    }

    public static void TreeSet3() {
        TreeSet<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        //String.CASE_INSENSITIVE_ORDER - это константа в классе java.lang.String, которая представляет
        // компаратор для строк, игнорирующий регистр символов при сравнении строк.
        set.add("Snow");
        set.add("John");
        set.add("King of ");
        set.add("john");
        set.add("North");
        HashSet<String> set2 = new HashSet<>(set);
        System.out.println(set2);
    }
}


