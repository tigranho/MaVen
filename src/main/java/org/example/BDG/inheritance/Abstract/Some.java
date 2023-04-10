package org.example.BDG.inheritance.Abstract;
//hm3
    interface A {
        void methOne();
        void methSecond();
    }
    class MyClass implements A {
        public void methOne() {
            System.out.println("Выполнение methOne() метода");
        }
        public void methSecond() {
            int x = 22;
            int y = 12;//как пример
            System.out.println(x+y + " Выполнение methSecond() метода");
        }
    }
    public class Some {
        public static void main(String[] args) {
            A object = new MyClass();
            object.methOne();
            object.methSecond();
        }
    }

