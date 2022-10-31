package Lecture6_BinarySearchQuestions;

public class FloorNumber {
    public static void main(String[] args) {
        System.out.println(binaryFind(new int[]{2, 3, 4, 5, 9, 24}, 6));
//        System.out.println(binaryFind(new int[]{24, 20, 17, 15, 13}, 16));
        System.out.println(binaryFind(new int[]{2, 3, 5, 9, 14, 16, 18}, 15));
    }

    static int binaryFind(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //Base Case
        if(target < arr[0]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }

            if(target > arr[mid]){
                start = mid + 1;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }

        }

        return arr[end];
    }
}
