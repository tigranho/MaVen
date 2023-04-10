package org.example.BDG.inheritance.Abstract.Abstract_hm5;

    class BaseClass {
        public void debug(String message) {
            System.out.println("Debug: " + message);
        }
    }
    class ExampleClass extends BaseClass {
        public void easyMethod() {
            debug("Напишем какой нибудь пример");
        }
    }
    class Test {
        public static void main(String[] args) {
            ExampleClass exampleObj = new ExampleClass();
            exampleObj.easyMethod();
        }
    }