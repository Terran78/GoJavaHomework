package com.stromilov.practice.module06;

final class ArraysUtils {

    static int sum(int array[]){
        int sum = 0;
        for (int anArray : array) {
            sum = sum + anArray;
        }
        return sum;
    }

    static int min(int array[]){
        int min = array[0];
        for (int anArray : array) {
            if (min > anArray)
                min = anArray;
        }
        return min;
    }

    static int max(int array[]){
        int max = array[0];
        for (int anArray : array) {
            if (max < anArray)
                max = anArray;
        }
        return max;
    }

    static int maxPositive(int array[]){
        int maxPositive = array[0];
        for (int anArray : array) {
            if (maxPositive < anArray && anArray > 0)
                maxPositive = anArray;
        }
        return maxPositive;
    }

    static long multiplication  (int array[]){
        long multiplication = 1;
        for (int anArray : array) {
            multiplication *= anArray;
        }
        return multiplication;
    }

    static long modulus(int array[]){
        long modulus = 1;
        long firstNumber = array[0];
        long lastNumber = array[array.length - 1];

        if (lastNumber != 0) {
            modulus = firstNumber % lastNumber;
        } else modulus = 0;
        return modulus;
    }

    static int secondLargest(int array[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    static int[] reverse(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    static int[] findEvenElements(int[] array) {
        int j=0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                j++;
            }
        }
        if (j != 0) {
            int[] evenElementsArray = new int[j];
            j=0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] % 2 == 0) {
                    evenElementsArray[j] = array[i];
                    j++;
                }
            }
        return evenElementsArray;
        }
        return null;
    }
}
