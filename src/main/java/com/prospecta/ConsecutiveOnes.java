package com.prospecta;

public class ConsecutiveOnes {

    public static void main(String[] args) {

        int[] nums = new int[] {1,1,0,1,1,1};

        int p1 = 0;
        int p2 = 0;
        int n = nums.length;
        int maxCount = Integer.MIN_VALUE;

        while (p2 < n) {

            if (nums[p1] == 1 && nums[p2] == 1) {
                if ((p2 - p1 + 1) > maxCount) maxCount = p2 - p1 + 1;
                p2++;
            } else {
                p2++;
                p1 = p2;
            }

        }

        if ((p2 - p1) > maxCount) maxCount = p2 - p1 + 1;

        System.out.println(maxCount);

    }

}
