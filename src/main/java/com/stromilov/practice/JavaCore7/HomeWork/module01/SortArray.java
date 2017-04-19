package com.stromilov.practice.JavaCore7.HomeWork.module01;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = new int[5];
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter number " + (i+1));
            arrayNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();
        System.out.print("Initial array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arrayNumber[i]);
            if (i < 4) System.out.print(", ");
        }
        System.out.println("");
        sortArray(arrayNumber);

    }

    private static void sortArray(int[] arraySort) {
        for (int i = 0; i < arraySort.length; i++) {
            int min = arraySort[i];
            int imin = i;
            for (int j = i+1; j < arraySort.length; j++) {
                if (arraySort[j] < min) {
                    min = arraySort[j];
                    imin = j;
                }
            }
            if (i != imin) {
                int temp = arraySort[i];
                arraySort[i] = arraySort[imin];
                arraySort[imin] = temp;
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arraySort[i]);
            if (i < 4) System.out.print(", ");
        }
    }
}
