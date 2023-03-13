package Lecture13_Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {3,6,9,10,2,4,5};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println(Arrays.toString(arr1));


    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSort(int[] arr, int low, int high){
        // Base Condition
        if(low > high){
            return;
        }


        // Logic
        int start = low;
        int end = high;
        int mid = start + (end - start)/2;

        int pivot = arr[mid];

        while (start <= end){
            // Do Something
            while (arr[start] < pivot){
                start++;
            }

            while (arr[end] > pivot){
                end--;
            }

            if(start <= end){
                swap(arr, start++, end--);
            }
        }

        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }
}
