package com.company;

import java.util.Random;

public class num7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[12];
        int max = array[0], index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max ) {
                max = array[i];
                index = i;
            }
            System.out.println("Самое большое число " + max + " и индекс его последнего вхождения " + index);
        }
    }
}
