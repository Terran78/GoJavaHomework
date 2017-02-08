package com.stromilov.practice.module02;

/**
 * Created by Admin on 27.01.2017.
 */
public class StringType {
    public static void main(String[] args) {
        String habr = "habrahabr";
        // получить длину строки
        int length = habr.length();
        // теперь можно узнать есть ли символ символ 'h' в "habrahabr"
        char searchChar = 'o';
        boolean isFound = false;
        for (int i = 0; i < length; ++i) {
            if (habr.charAt(i) == searchChar) {
                isFound = true;
                break; // первое вхождение
            }
        }
        System.out.println(message(isFound)); // Your char had been found!
        // ой, забыл, есть же метод indexOf
        System.out.println(message(habr.indexOf(searchChar) != -1)); // Your char had been found!
    }

    private static String message(boolean b) {
        return "Your char had" + (b ? " " : "n't ") + "been found!";
    }
}
