package Lecture6_BinarySearchQuestions;

public class BsInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6 ,7, 8 ,90, 100};
        System.out.println(search(arr, 90));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart =  end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int i, int j){
        int start = i;
        int end = j;

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
