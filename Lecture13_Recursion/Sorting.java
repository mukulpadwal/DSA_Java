package Lecture13_Recursion;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2, 5,4,3,2,1};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        helper1(arr, arr.length - 1, 0);
    }

    static void helper1(int[] arr, int row, int col){
        if(row == 0){
            return;
        }

        if (col < row){
            swap(arr, col, col+1);
            helper1(arr, row, col+1);
        } else {
            helper1(arr, row-1, 0);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int[] arr){
        helper2(arr, arr.length , 0, 0);
    }

    static void helper2(int[] arr, int row, int col, int maxIndex){
        if(row == 0){
            return;
        }

        if(col < row){
            if(arr[maxIndex] < arr[col]){
                helper2(arr, row, col+1, col);
            } else {
                helper2(arr, row, col+1, maxIndex);
            }
        } else {
            int temp = arr[row-1];
            arr[row-1] = arr[maxIndex];
            arr[maxIndex] = temp;

            helper2(arr, row-1, 0, 0);
        }
    }
}
