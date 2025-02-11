package com.prospecta;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[]{41, 9, 9, 48, 11, 2, 11, 12, 28, 10, 15, 4, 16, 48};
        bubbleSort(arr);

    }

    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - 1; j++) {

                if (arr[j] > arr[j+1]) {
                    int store = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = store;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
