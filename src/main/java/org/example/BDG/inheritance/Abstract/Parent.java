package org.example.BDG.inheritance.Abstract;
//hm1
    abstract class Parent {
          abstract void message();
    }
    class ChildOne extends Parent {
          void message() {
            System.out.println("Первый субкласс");
        }
    }
    class ChildSecond extends Parent {
         void message() {
            System.out.println("Второй субкласс");
        }
    }

