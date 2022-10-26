package Lecture3_LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 6, 8},
                {55, 67, 69},
                {90, 0}
        };

        System.out.println(Arrays.toString(search(arr, 69)));

        System.out.println(max(arr));

        System.out.println(min(arr));
    }

    static int[] search(int[][] arr, int target){

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int maxValue = Integer.MIN_VALUE;

        // Method 1
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(maxValue < arr[row][col]){
//                    maxValue = arr[row][col];
//                }
//            }
//        }

        // Method 2
        for (int[] row : arr) {
            for(int ele: row){
                if(maxValue < ele){
                    maxValue = ele;
                }
            }
        }

        return maxValue;
    }

    static int min(int[][] arr){
        int minValue = Integer.MAX_VALUE;

        // Method 1
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                if(minValue > arr[row][col]){
//                    minValue = arr[row][col];
//                }
//            }
//        }

        // Method 2
        for (int[] row : arr) {
            for(int ele: row){
                if(ele < minValue){
                    minValue = ele;
                }
            }
        }

        return minValue;
    }
}


