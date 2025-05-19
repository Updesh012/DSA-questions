package com.prospecta;

import java.util.Arrays;

public class RotateBy90Degree {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

//        for (int[] ints : matrix) {
//            System.out.println(Arrays.toString(ints));
//        }

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = m - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

    }

}
