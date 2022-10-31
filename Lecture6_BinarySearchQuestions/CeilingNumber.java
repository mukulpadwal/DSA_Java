package Lecture6_BinarySearchQuestions;

// Ceiling Number is a smallest number greatest or equal to the target
public class CeilingNumber {
    public static void main(String[] args) {
        System.out.println(linearFind(new int[]{2, 3, 4, 5, 9, 24}, 6));
        System.out.println(linearFind(new int[]{24, 20, 17, 15, 13}, 16));

        System.out.println(binaryFind(new int[]{2, 3, 4, 5, 9, 24}, 6));
        System.out.println(binaryFind(new int[]{24, 20, 17, 15, 13}, 16));
        System.out.println(binaryFind(new int[]{2, 3, 5, 9, 14, 16, 18}, 15));

    }

    static int linearFind(int[] arr, int target){
        //Base Case
        if(target > arr[arr.length - 1]){
            return -1;
        }

        // Order Agnostic ka bhi khayal rakhna padega

        boolean isAsc = arr[0] < arr[arr.length-1];

        if(isAsc){
            for (int j : arr) {
                if (j >= target) {
                    return j;
                }
            }
        } else {
            for (int i = arr.length-1; i >= 0 ; i--) {
                if(arr[i] >= target){
                    return arr[i];
                }
            }
        }

        return -1;
    }

    static int binaryFind(int[] arr, int target){
        //Base Case
        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[0] < arr[arr.length-1];

        while (start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                }

                if(target < arr[mid]){
                    end = mid;
                }
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                }

                if(target < arr[mid]){
                    start = mid;
                }
            }


        }

        return arr[end];
    }
}
