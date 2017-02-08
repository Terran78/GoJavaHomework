package com.stromilov.practice.module02;

import java.util.Arrays;
import java.util.Random;

public class UseRandomForArrays {

    static Random randomGenerator = new Random();

    public static void main(String[] args) {

        Random randomGenerator = new Random();

//        int[] randomArray = getRandomPositivIntsArray();

//        System.out.println(Arrays.toString(randomArray));

        int[] randomArray2 = new int[100];

        for (int i = 0; i < randomArray2.length; i++) {

            randomArray2[i] = getRandomInteger2(300);
        }

        System.out.println(Arrays.toString(randomArray2));
    }

    public static int[] getRandomPositivIntsArray(int length, int maxPossibleValueInArray) {
        int[] randomArray = new int[length];

        for (int i = 0; i < randomArray.length; i++) {

            randomArray[i] = getRandomPositivInteger1(maxPossibleValueInArray);
        }
        return randomArray;
    }

    private static int getRandomPositivInteger1(int maxValue) {

        int randomValue = (int) (Math.random() * maxValue);

        return randomValue;
    }
    private static int getRandomInteger2(int maxValue) {

        int randomPositivInt = randomGenerator.nextInt(maxValue);
        int randomValue =randomGenerator.nextBoolean() ? randomPositivInt : -1 * randomPositivInt;

        return randomValue;
    }
}
