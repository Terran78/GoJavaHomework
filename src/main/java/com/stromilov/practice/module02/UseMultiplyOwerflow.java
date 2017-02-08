package com.stromilov.practice.module02;

import java.util.Arrays;

public class UseMultiplyOwerflow {
    public static void main(String[] args) {
        int[] randomArray = UseRandomForArrays.getRandomPositivIntsArray(5,500);

        System.out.println(Arrays.toString(randomArray));

        long result = MultiplyArray(randomArray, randomArray.length-1);

        System.out.println(result);
    }

    private static long MultiplyArray(int[] randomArray, int indexToBegin) {
        if (indexToBegin == 0) {
            return (long)randomArray[indexToBegin];
        }
            return randomArray[indexToBegin] * MultiplyArray(randomArray, indexToBegin -1);
    }
}
