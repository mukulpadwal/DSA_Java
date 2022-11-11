package Lecture7_2D_BinarySearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {28, 29, 37, 49},
                       {33, 34, 38, 50}};

        System.out.println(Arrays.toString(binarySearch(arr, 38)));
        System.out.println(Arrays.toString(binarySearch(arr, 10)));
        System.out.println(Arrays.toString(binarySearch(arr, 40)));
        System.out.println(Arrays.toString(binarySearch(arr, 33)));
        System.out.println(Arrays.toString(binarySearch(arr, 50)));
        System.out.println(Arrays.toString(binarySearch(arr, 39)));

    }

    public static int[] binarySearch(int[][] arr, int target){

        int start = 0;
        int end = arr[0].length - 1;

        while(start < arr.length && end >= 0){

            int element = arr[start][end];

            if(target == element){
                return new int[]{start, end};
            } else if (target > element) {
                start++;
            } else {
                end--;
            }

        }

        return new int[]{-1,-1};
    }


}
