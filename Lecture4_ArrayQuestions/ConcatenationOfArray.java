package Lecture4_ArrayQuestions;

import java.util.Arrays;

// https://leetcode.com/problems/concatenation-of-array/description/

public class ConcatenationOfArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,1})));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int counter = 0;
        int index = 0;

        while (counter < 2){
            for(int i=0; i<nums.length; i++){
                ans[index++] = nums[i];
            }

            counter++;
        }

        return ans;
    }
}
