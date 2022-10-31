package Lecture6_BinarySearchQuestions;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
        System.out.println(removeDuplicatesOptimised(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    static int removeDuplicates(int[] nums) {
        int maxSubstitute = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            for(int j= i+1; j<nums.length; j++){
                if(nums[j] == nums[i]){
                    nums[j] = maxSubstitute;
                }
            }
        }

        Arrays.sort(nums);

        int k = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != maxSubstitute){
                k++;
            }
        }

        return k;
    }

    static int removeDuplicatesOptimised(int[] nums) {
        int i=0;
        int j = 1;

        while(i< nums.length && j< nums.length){
            while (nums[i] == nums[j]){
                j++;
            }

            while (j< nums.length && nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        return i+1;
    }
}
