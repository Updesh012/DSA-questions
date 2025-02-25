package com.prospecta;

public class SortColors {

    public static void main(String[] args) {

        int[] nums = new int[] {2,0,2,1,1,0};
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int elem : nums) {
            if (elem == 0) count0++;
            if (elem == 1) count1++;
            if (elem == 2) count2++;
        }

        int idx = 0;
        while (count0 > 0) {
            nums[idx++] = 0;
            count0--;
        }

        while(count1 > 0) {
            nums[idx++] = 1;
            count1--;
        }

        while (count2 > 0) {
            nums[idx++] = 2;
            count2--;
        }


    }
}