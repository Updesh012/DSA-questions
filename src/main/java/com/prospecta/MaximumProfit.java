package com.prospecta;

public class MaximumProfit {

    public static void main(String[] args) {

        int[] arr = new int[] {7,1,5,3,6,4};

        int minPointer = 0;
        int maxPointer = 0;
        int maxProfit = -1;
        int n = arr.length;

        while (minPointer < n && maxPointer < n) {
            if (minPointer == maxPointer) {
                maxPointer++;
            } else if (arr[minPointer] > arr[maxPointer]) {
                minPointer = maxPointer;
            } else {
                maxProfit = Math.max(maxProfit, arr[maxPointer] - arr[minPointer]);
                maxPointer++;
            }
        }

        System.out.println(maxPointer);
    }

}
