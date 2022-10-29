package Lecture5_BinarySearch;

public class Basics {
    public static void main(String[] args) {
        // Binary Search : Optimised way to search
        // Used for sorted arrays(either in ascending or descending order)


        // STEPS OF BINARY SEARCH
        // STEP 1 : Find the middle index of the array
        // Formula -> mid = (start + end)/2;

        // STEP 2 : Check if the target element is greater than middle element
        //          then search in the right part of the array
        //          If the target element is smaller than middle element then
        //          search in the left part of the array
        //          If the target element is equal to the middle element then
        //          return the index

        // Time Complexity
        // Best Case : linear O(1)
        // Worst Case : logarithmic O(log(n))

        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 4));
        System.out.println(binarySearch(new int[]{6, 5, 4, 3, 2, 1}, 55));

    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        // Code for binary search

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            // Finding the middle element
            // int mid = (start + end)/2;
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            } else if(target < arr[mid]){
                // Search in the left part of the array
                end = mid - 1;
            } else {
                // Search in the right part of the array
                start = mid + 1;
            }
        }

        return -1;
    }
}
