package com.stromilov.practice.module02.HomeWork_2_1;

public class HomeWork_2_1 {

    public static void main(String[] args) {
        double[] doubleArray = {-5.2, -1.5, 2.4, 2.5, 3.7, 3.5, 4.4, -4.5, 4.7, 4.9};
        int[] intArray = {43, 2, 3, 4, 5, 6, 7, 8, -9, 10};

        System.out.println("Sum double -> " + Sum(doubleArray));
        System.out.println("Sum int -> " + Sum(intArray));

        System.out.println("Min double -> " + doMin);
        System.out.println("Min int -> " + intMin);

        System.out.println("Max double -> " + doMax);
        System.out.println("Max int -> " + intMax);

        System.out.println("Max positive double -> " + doMaxPos);
        System.out.println("Max positive int -> " + intMaxPos);

        System.out.println("Multiple double -> " + doMult);
        System.out.println("Multiple int -> " + intMult);

        System.out.println("Modulus 1 and last double -> " + (doubleArray[0]%doubleArray[doubleArray.length -1]));
        System.out.println("Modulus 1 and last ins -> " + (intArray[0]%intArray[intArray.length -1]));

        System.out.println("Second largest double -> " + doSecLar);
        System.out.println("Second largest int -> " + intSecLar);


        // Sum all elements of int or double
        public void  Sum(double[] array){

            int Sum = 0;
            for (int i = 0; i < array.length; i++) {
            Sum += array[i];
        }
        return Sum;
    }


        double doSum, doMin, doMax, doMaxPos, doMult, doSecLar;
        doSum =  doMaxPos = doSecLar = 0;
        doMult = 1;
        doMin = doMax = doubleArray[0];
        int intSum, intMin, intMax, intMaxPos, intMult, intSecLar;
        intSum = intMaxPos = intSecLar = 0;
        intMult = 1;
        intMin = intMax = intArray[0];

        for (int i = 0; i < doubleArray.length; i++) {
            doSum += doubleArray[i];  // считаем суммы
            if (doMin > doubleArray[i]) doMin = doubleArray[i];
            if (doMax < doubleArray[i]) doMax = doubleArray[i];
            if (doMaxPos < doubleArray[i] && doubleArray[i] > 0) doMaxPos = doubleArray[i];
            doMult *= doubleArray[i]; // multiplication

            intSum += intArray[i]; // т.к размеры массивов одинаковы, то чтоб не повторяться.
            if (intMin > intArray[i]) intMin = intArray[i];
            if (intMax < intArray[i]) intMax = intArray[i];
            if (intMaxPos < intArray[i] && intArray[i] > 0) intMaxPos = intArray[i];
            intMult *= intArray[i];
        }
        for (int i = 0; i < 10 ; i++) {
            if (doSecLar < doubleArray[i] && doubleArray[i] != doMax) doSecLar = doubleArray[i];
            if (intSecLar < intArray[i] && intArray[i] != intMax) intSecLar = intArray[i];

        }




    }
}
