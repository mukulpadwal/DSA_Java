package Lecture1_Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(maxValue(arr));
    }

    static int maxValue(int[] arr){
        // Method 1
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
//        return max;

        // Method 2
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i-1], arr[i]);
        }
        return max;
    }
}
