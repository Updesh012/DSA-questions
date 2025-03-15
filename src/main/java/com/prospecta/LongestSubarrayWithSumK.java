package com.prospecta;

import java.util.HashMap;

public class LongestSubarrayWithSumK {

    public static void main(String[] args) {

        int[] arr = new int[] {10, 5, 2, 7, 1, -10};
        int k = 15;
        int n = arr.length;
        HashMap<Long, Integer> prefixSum = new HashMap<>();
        long sum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == k) maxLength = Math.max(maxLength, i + 1);

            long checkSum = sum - k;
            if (prefixSum.get(checkSum) != null) {
                maxLength = Math.max(maxLength, i - prefixSum.get(checkSum));
            }

            if (!prefixSum.containsKey(sum)) {
                prefixSum.put(sum, i);
            }
        }

        System.out.println(maxLength);

    }



}
