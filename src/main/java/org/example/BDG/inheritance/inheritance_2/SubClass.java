package org.example.BDG.inheritance.inheritance_2;

public class SubClass extends SuperClass {
    protected String message = "Hello SubClass class";

    @Override
    public void printMessage() {
        System.out.println(super.message);
        System.out.println(message);
    }
}
