package Lecture3_LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {5,67, 87, 54};
        System.out.println(minNum(arr));
    }

    static int minNum(int[] arr){
        int mini = Integer.MAX_VALUE;

        for (int ele :
                arr) {
            if(ele < mini){
                mini = ele;
            }
        }

        return mini;
    }


}
