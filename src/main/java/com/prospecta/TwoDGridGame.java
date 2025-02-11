package com.prospecta;

import java.util.HashMap;
import java.util.List;
import java.util.*;

public class TwoDGridGame {

    public static void main(String[] args) {

        int[][] grid = {
                {20, 3, 20, 17, 2, 12, 15, 17, 4, 15},
                {20, 10, 13, 14, 15, 5, 2, 3, 14, 3}
        };

        System.out.println(gridGame(grid)); // Output the result

    }

    public static long gridGame(int[][] grid) {
        int n = grid[0].length;

        // Prefix sums for row 0 and row 1
        long[] prefixRow0 = new long[n + 1];
        long[] prefixRow1 = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefixRow0[i + 1] = prefixRow0[i] + grid[0][i];
            prefixRow1[i + 1] = prefixRow1[i] + grid[1][i];
        }

        // Calculate the minimum "maximum second robot's score"
        long result = Long.MAX_VALUE;

        for (int split = 0; split < n; split++) {
            // Points left on the top row after split (row 0, columns split+1 to n-1)
            long topPoints = prefixRow0[n] - prefixRow0[split + 1];

            // Points left on the bottom row before split (row 1, columns 0 to split-1)
            long bottomPoints = prefixRow1[split];

            // The second robot's maximum possible score
            long secondRobotScore = Math.max(topPoints, bottomPoints);

            // Minimize this maximum score
            result = Math.min(result, secondRobotScore);
        }

        return result;
    }

    public static long gridGame2(int[][] grid) {

        HashMap<Integer, List<int[][]>> hm = new HashMap<>();

        int colLength = grid[0].length;

        List<Long> first = calculation (colLength, grid);
        int index = first.get(1).intValue();
        long sum = first.get(0);

        int i = 0;
        while (i <= index) {
            grid[0][i] = 0;
            i++;
        }

        while (index < colLength) {
            grid[1][index] = 0;
            index++;
        }

        for (int k =0; k < grid.length; k++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(grid[k][j] + " ");
            }
            System.out.println();
        }

        //  System.out.println(index);
        List<Long> result = calculation (colLength, grid);

        return result.get(0);
    }

    public static List<Long> calculation (int colLength, int[][] grid) {

        long sum = 0;
        long maxSum = 0;
        List<Long> result = new ArrayList<>();
        long[] firstRSum = new long[colLength];
        for (int i = 0; i < colLength; i++) {
            sum += grid[0][i];
            firstRSum[i] = sum;
        }
        sum = 0;

        long index = -1;
        for (int i = 0; i < colLength; i++) {

            sum = firstRSum[i];
            int j = i;
            while (j < colLength) {
                sum += grid[1][j];
                j++;
            }

            if (sum > maxSum) {
                maxSum = sum;
                index = i;

            } else if (sum == maxSum) {
                System.out.println("sum is same " + maxSum);
            }

        }



        result.add(maxSum);
        result.add(index);

        // System.out.println(index);
        return result;
    }

}
