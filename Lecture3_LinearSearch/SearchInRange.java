package Lecture3_LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,34,54,65,43};

        int start = 1;
        int end = 3;

        System.out.println(linearSearch(arr, start, end, 34));
    }

    static int linearSearch(int[] arr, int start, int end, int target){

        if(arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            // check for element at every index if it is equal to target
            int element = arr[i];
            if(target == element){
                return i;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
