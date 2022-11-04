package Lecture6_BinarySearchQuestions;

// https://leetcode.com/problems/find-in-mountain-array/

public class FindInMountainArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 3, 1};
        int target = 3;

        System.out.println(findInMountainArray(target, arr));

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82};
        int target1 = 1;

        System.out.println(findInMountainArray(target1, arr1));
    }

    static int findInMountainArray(int target, int[] arr) {
        int peakIndex = findPeakIndex(arr);

        int firstTry = binarySearch(arr, target, 0, peakIndex);

        if(firstTry != -1){
            return firstTry;
        }

        return binarySearch(arr, target, peakIndex+1, arr.length -1);
    }

    static int findPeakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else if (arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
        }

        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }


}
