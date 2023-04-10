package org.example.BDG.inheritance.Abstract;

    abstract class Shape {
        abstract void draw();
        abstract void erase();
    }
    class Circle extends Shape {
        void draw() {
            System.out.println("Рисует круг");
        }
        void erase() {
            System.out.println("Удаляет круг");
        }
    }
    class Triangle extends Shape {
        void draw() {
            System.out.println("Рисует Треугольник");
        }
        void erase() {
            System.out.println("Удаляет Треугольник");
        }
    }
    class Square extends Shape {
        void draw() {
            System.out.println("Рисует Квадрат");
        }
        void erase() {
            System.out.println("Удаляет Квадрат");
        }
    }