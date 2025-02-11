package com.prospecta;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MatrixPaint {

    public static void main(String[] args) {

        int[] arr = new int[] {2,8,7,4,1,3,5,6,9};
        int[][] mat = new int[][]{{3,2,5},{1,4,6},{8,7,9}};
        int i = firstCompleteIndex(arr, mat);
        System.out.println(i);

    }


    public static int firstCompleteIndex(int[] arr, int[][] mat) {

        int rows = mat.length, cols = mat[0].length;
        Map<Integer, int[]> positionMap = new HashMap<>();
        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];
        Arrays.fill(rowCount, cols);
        Arrays.fill(colCount, rows);
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < cols; ++c) {
                positionMap.put(mat[r][c], new int[]{r, c});
            }
        }
        for (int idx = 0; idx < arr.length; ++idx) {
            int[] pos = positionMap.get(arr[idx]);
            if (--rowCount[pos[0]] == 0 || --colCount[pos[1]] == 0) {
                return idx;
            }
        }
        return -1;
    }

}
