package com.prospecta;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] arr = new int[] {0,3,7,2,5,8,4,6,0,1};
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int maxLength = 0;
        int currentLength = 0;

        for (Integer elem : set) {

            if (!set.contains(elem-1)) {

                currentLength++;
                while (set.contains(elem+1)) {
                    currentLength++;
                    elem++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }


        System.out.println(maxLength);

    }

}
