package com.prospecta;

import java.util.*;

public class FreqOfLimitedElem {

    public static void main(String[] args) {

        int[] arr = new int[] {2, 3, 2, 3, 5};
        Map<Integer, Integer> hm = new HashMap<>();
        for (int elem : arr) {
            Integer currentCount = hm.putIfAbsent(elem, 1);
            if (Objects.nonNull(currentCount)) {
                hm.put(elem, hm.get(elem) + 1);
            }
        }

        System.out.println(arr.length);
        int[] outputArr = new int[arr.length];



        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            outputArr[entry.getKey() - 1] = entry.getValue();
        }

        Integer[] array = Arrays.stream(outputArr).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.asList(array));

    }

}
