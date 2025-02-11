package com.prospecta;

import java.util.Arrays;

public class ShiftZeroes {

    public static void main(String[] args) {

        int[] nums = new int[] {1,0,1};
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue;
            for (int j = i; j < n; j++) {

                if (nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    break;
                }


            }
        }

        System.out.println(Arrays.toString(nums));

    }

}
