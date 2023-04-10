package org.example.BDG.class_objects.one;
public class Main {
    class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void bark() {
            System.out.println(name + " говорит Гав-гав!");
        }
    }

    class Cat {
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void meow() {
            System.out.println(name + " говорит Мяу!");
        }
    }

    class Horse {
        private String name;
        private int age;

        public Horse(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void neigh() {
            System.out.println(name + " говорит И-го-го!");
        }
    }
    public static void main(String[] args){

    }
}
