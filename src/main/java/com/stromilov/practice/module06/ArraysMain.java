package com.stromilov.practice.module06;

import java.util.Arrays;

import static com.stromilov.practice.module06.ArraysUtils.*;

public class ArraysMain {
    public static void main(String[] args) {
        int[] intArray = {-14, 21, 32, 4, 54, 61, -7, 88, 9, -12};

        System.out.println("Total is " + sum(intArray));

        System.out.println("Minimal number is " + min(intArray));

        System.out.println("Maximum number is " + max(intArray));

        System.out.println("Maximum positive number is " + maxPositive(intArray));

        System.out.println("The result of multiplying of array values is " + multiplication(intArray));

        System.out.println("The result of modulus operation is " + modulus(intArray));

        System.out.println("Second maximum number after " + max(intArray) + " is " + secondLargest(intArray));

        System.out.println(Arrays.toString(intArray));
        System.out.println("After revers elements array:");
        System.out.println(Arrays.toString(reverse(intArray)));

        System.out.println("Even elements of array: " + Arrays.toString(findEvenElements(intArray)));
    }
}
