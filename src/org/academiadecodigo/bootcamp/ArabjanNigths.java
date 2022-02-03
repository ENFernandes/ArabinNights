package org.academiadecodigo.bootcamp;

import java.util.SortedMap;

public class ArabjanNigths {
    public static void main(String[] args) {

        MagicLamp m1 = new MagicLamp("Banana");
        MagicLamp m2 = new MagicLamp("Tenho sono");

        m1.newLamp(2);
        m1.newLamp(1);
        m2.newLamp(3);
        m2.newLamp(2);
        m2.newLamp(1);

        System.out.printf(m1.toString());
        System.out.printf(m2.toString());

    }
}
