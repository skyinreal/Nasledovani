package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat( "Маруся", "серая");
        Cat cat2 = new Cat( "Шуня", "серая");
        cat1.setSpeed(4);
        cat1.move();
            cat1.toString();

        System.out.println(cat1);
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));



    }

}
