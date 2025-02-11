package com.prospecta;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = new int[]{24, 18, 38, 43, 14, 40, 1, 54};
        int l = 0;
        int r = arr.length - 1;

        System.out.println(Arrays.toString(arr));
        quickSort(arr, l, r);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort (int[] arr, int l, int r) {

        if (l < r) {
            int pivot = findPivot(arr, l, r);
            quickSort(arr, l, pivot - 1);
            quickSort(arr, pivot + 1, r);
        }
    }

    public static int findPivot (int[] arr, int l, int r) {
        int pivot = arr[l];
        int i = l;
        int j = r;
        while (i < j) {

            while (i <= r && arr[i] <= pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        return j;

    }

}
