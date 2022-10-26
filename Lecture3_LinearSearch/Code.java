package Lecture3_LinearSearch;

public class Code {
    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 3, 78, 69};

        int target = 69;

        int ans = linearSearch(arr, target);

        System.out.println(ans);

        int key = 696;

        int ans1 = linearSearch(arr, key);

        System.out.println(ans1);

        int k = 69;

        int ans2 = linearSearchElement(arr, k);

        System.out.println(ans2);

        int k1 = 69;

        boolean ans3 = linearSearchBool(arr, k1);

        System.out.println(ans3);
    }

    // CASE 1 : return the index by searching the element
    // search in the array
    // we are going to return the index if the element is found
    // otherwise we are going to return -1
    static int linearSearch(int[] arr, int key){

        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is equal to target
            int element = arr[i];
            if(key == element){
                return i;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
    
    // CASE 2 : return the element by searching the index
    static int linearSearchElement(int[] arr, int target){
        
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        for(int ele: arr){
            if(ele == target){
                return ele;
            }
        }
        
        return Integer.MAX_VALUE;
    }

    // CASE 3 : return the element by searching the index
    static boolean linearSearchBool(int[] arr, int target){

        if(arr.length == 0){
            return false;
        }

        for(int ele: arr){
            if(ele == target){
                return true;
            }
        }

        return false;

    }
}
