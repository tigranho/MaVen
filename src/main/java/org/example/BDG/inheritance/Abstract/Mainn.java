package org.example.BDG.inheritance.Abstract;
//hm2
public class Mainn {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();
        circle.draw();
        triangle.draw();
        square.draw();

        circle.erase();
        triangle.erase();
        square.erase();
    }
}
