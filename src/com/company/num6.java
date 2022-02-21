package com.company;

import java.util.Random;

public class num6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        if (array[0] < array[1] && array[1] < array[2] && array[2] < array[3]) {
            System.out.println("массив является строго возрастающей последовательностью");
        } else {
                System.out.println("массив не является строго возрастающей последовательностью");
        }
    }
}
