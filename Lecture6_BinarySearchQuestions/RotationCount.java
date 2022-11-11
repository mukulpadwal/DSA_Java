package Lecture6_BinarySearchQuestions;

public class RotationCount {
    public static void main(String[] args) {

    }

    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[start]){
                start = mid;
            } else if(arr[mid] > arr[end]){
                end = mid - 1;
            }
        }

        return end;
    }
}
