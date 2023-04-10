package org.example.BDG.Enumeration.hm_2;


public class CoffeeSizes {
     enum CoffeeSize {
        SMALL,
        MEDIUM,
        LARGE
    }

    public static void main(String[] args) {
        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println("Size " + size.name());
        }
    }
}
