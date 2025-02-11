package com.prospecta;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = new int[] {4, 1, 3, 9, 7};

        int n = array.length;

        long minValue = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {


            int minIndex = -1;
           for (int j = i + 1; j < n; j++) {
               if (array[j] <  minValue) {
                   minValue = array[j];
                   minIndex = j;
               }
           }
            if (minIndex != -1) {
                int elem = array[minIndex];
                array[minIndex] = array[i];
                array[i] = elem;
            }

        }

    }
}
