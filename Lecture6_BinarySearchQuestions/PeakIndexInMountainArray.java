package Lecture6_BinarySearchQuestions;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{}));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                // We are in the decreasing part of the array
                //So we need to find in the left part of the array with the middle element being the possible answer
                end = mid;
            }

            if(arr[mid] < arr[mid+1]){
                // We are in the ascending part of the array
                // so we need to find in the right part of the array as we need to find the peak element of the array
                start = mid + 1;
            }
        }

        return start;
    }
}
