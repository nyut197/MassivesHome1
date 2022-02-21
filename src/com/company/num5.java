package com.company;

import java.util.Random;

public class num5 {
    public static void main(String[] args) {
        double sum = 0;
        double sum1 = 0;
        int n = 5;
        double avg = 0;
        double avg1 = 0;
        Random random = new Random();
        int[] array = new int[5];
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15);
            System.out.print(array[i] + " ");
            sum += array[i];
            avg = sum / n;
        }
            System.out.print("Среднее арифметическое первого массива" + "=" + avg);

        System.out.println(" ");
        int[] array2 = new int[5];
        for(int j = 0; j < array2.length; j++) {
            array2[j] = random.nextInt(15);
            System.out.print(array2[j] + " ");
            sum1 += array2[j];
            avg1 = sum1 / n;
        }
        System.out.print("Среднее арифметическое второго массива" + "=" + avg1);
        System.out.println(" ");
        if (avg > avg1) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else if (avg < avg1) {
            System.out.println("Среднее арифметическое второго массива больше");
        } else {
            System.out.println("Средние арифметические обоих массивов равны");
        }
    }
}
