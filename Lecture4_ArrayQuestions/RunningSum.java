package Lecture4_ArrayQuestions;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/description/

public class RunningSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,2,3,4})));
    }

    static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];

        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            ans[i] = sum;
        }

        return ans;
    }
}
