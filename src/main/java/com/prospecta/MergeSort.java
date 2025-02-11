package com.prospecta;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = new int[] {4, 1, 9, 7};
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort (int[] arr, int l, int r) {

        if (l >= r) return;;

        int mid = l + (r - l) / 2;


        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid, r);

    }

    public static void merge(int[] arr, int l, int mid, int r) {

        int[] leftArray = Arrays.copyOfRange(arr, l, mid + 1);
        int[] rightArray = Arrays.copyOfRange(arr, mid + 1, r + 1);

        int leftPointer = 0;
        int rightPointer = 0;

        int[] tempResultArr = new int[leftArray.length + rightArray.length];
        int index = 0;
        while(leftPointer < leftArray.length && rightPointer < rightArray.length) {

            if (leftArray[leftPointer] > rightArray[rightPointer]) {
                tempResultArr[index] = rightArray[rightPointer];
                index++;
                rightPointer++;
            } else {
                tempResultArr[index] = leftArray[leftPointer];
                index++;
                leftPointer++;
            }
        }

        while (leftPointer < leftArray.length) {
            tempResultArr[index] = leftArray[leftPointer];
            index++;
            leftPointer++;
        }

        while (rightPointer < rightArray.length) {
            tempResultArr[index] = rightArray[rightPointer];
            index++;
            rightPointer++;
        }

        System.out.println(Arrays.toString(tempResultArr));
        int idx = 0;
        while (idx < tempResultArr.length) {
            arr[l] = tempResultArr[idx];
            l++;
            idx++;
        }

    }



}
