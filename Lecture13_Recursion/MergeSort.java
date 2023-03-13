package Lecture13_Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = {3,4,2,1};
//        arr = mergeSort(arr);
//        System.out.println(Arrays.toString(arr));

        int[] arr = {3,4,2,1,9,8,7,6,5};
        mergeSortInPlace(arr,0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){
        // Base Condition
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] leftPart = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] rightPart = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftPart, rightPart);
    }

    static int[] merge(int[] left, int[] right){
        int[] newArr = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                newArr[k] = left[i];
                i++;
            } else {
                newArr[k] = right[j];
                j++;
            }

            k++;
        }

        while (i < left.length){
            newArr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length){
            newArr[k] = right[j];
            j++;
            k++;
        }

        return newArr;
    }


    static void mergeSortInPlace(int[] arr, int start, int end){
        // Base Condition
        if(end - start == 0){
            return;
        }

        int mid = start + (end - start)/2;

        mergeSortInPlace(arr,0, mid);
        mergeSortInPlace(arr, mid+1, end);

        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end){
        int[] newArr = new int[end - start + 1];

        int i = start;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= end){
            if(arr[i] < arr[j]){
                newArr[k] = arr[i];
                i++;
            } else {
                newArr[k] = arr[j];
                j++;
            }

            k++;
        }

        while (i <= mid){
            newArr[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end){
            newArr[k] = arr[j];
            j++;
            k++;
        }

        for(int l=0; l<newArr.length; l++){
            arr[start + l] = newArr[l];
        }
    }
}
