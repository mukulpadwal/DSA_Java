package Lecture4_ArrayQuestions;

import java.util.Arrays;

// https://leetcode.com/problems/build-array-from-permutation/

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(buildArray(new int[]{5,0,1,2,3,4})));
    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
