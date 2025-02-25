package com.prospecta;

public class MaxSumOfSubArray {

    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, -3, 4, -9, 10, 13, -99, 100};
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);

    }
}
