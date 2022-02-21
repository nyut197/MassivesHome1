package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        int[] array = new int[20];
        Random random = new Random();
        int i;
        for (i = 0; i < 20; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
            for (i = 0; i < 20; i++) {
                if (array[i] % 2 != 0) {
                    array[i] = 0;
                }
                System.out.println(" ");
                System.out.print(array[i] + " ");
        }
    }
}
