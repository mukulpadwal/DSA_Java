package Lecture4_ArrayQuestions;

import java.util.Arrays;

public class SmallerNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent1(new int[]{8,1,2,2,3})));
    }

    static int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int currEle = nums[i];
            int count = 0;

            for(int j=0; j<nums.length; j++){
                if(i == j){
                    continue;
                }

                if(nums[j] < currEle){
                    count++;
                }


            }
            ans[i] = count;
        }

        return ans;
    }


    // Think of an optimised logic
    static int[] smallerNumbersThanCurrent2(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[nums.length];

        for (int i = nums.length-1; i >= 0; i--) {

        }

        return ans;
    }
}
