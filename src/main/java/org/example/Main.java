package org.example;

import org.example.enums.Plan;

public class Main {


    public static void main(String[] args) {
        Healthplan Person1 = new Healthplan(1 , "Semih", Plan.BASIC);

        System.out.println(Person1);

    }
}
