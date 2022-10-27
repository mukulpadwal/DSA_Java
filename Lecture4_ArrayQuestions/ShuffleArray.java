package Lecture4_ArrayQuestions;

import java.util.Arrays;

// https://leetcode.com/problems/shuffle-the-array/description/

public class ShuffleArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2,5,1,3,4,7},3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int index = 0;

        for(int i=0,j=n; i<n &&j<nums.length; i++,j++){
            ans[index++] = nums[i];
            ans[index++] = nums[j];
        }

        return ans;
    }
}
