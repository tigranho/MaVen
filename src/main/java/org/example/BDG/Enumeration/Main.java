package org.example.BDG.Enumeration;
//HM_1
public class Main {
    enum Signal {
        RED,
        YELLOW,
        GREEN,
    }
    Signal color = Signal.RED;
    public void change()throws InterruptedException {
        switch (color) {
            case RED:
                Thread.sleep(1000);
                color = Signal.YELLOW;
                break;
            case YELLOW:
                Thread.sleep(1000);
                color = Signal.GREEN;
                break;
            case GREEN:
                Thread.sleep(1000);
                color = Signal.RED;
                break;
        }
    }
    public String toString() {
        return "The traffic light is " + color;
    }
    public static void main(String[] args) throws InterruptedException {
        Main t = new Main();
        for (int i = 0; i < 12; i++) {
            System.out.println(t);
            t.change();
        }
    }
}