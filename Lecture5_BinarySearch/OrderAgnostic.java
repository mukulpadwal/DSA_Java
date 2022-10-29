package Lecture5_BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        // What if we don't know wether the array is sorted in ascending order or descending order
        // Ques : How to find in which way the array is sorted
        System.out.println(orderAgnosticBS(new int[]{1, 2, 3, 4, 5, 6}, 4));
        System.out.println(orderAgnosticBS(new int[]{6, 4, 3, 2, 1}, 4));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
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
