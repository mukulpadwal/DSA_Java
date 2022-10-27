package Lecture4_ArrayQuestions;

// https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayInGivenOrder {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            target.add(index[i], nums[i]);
        }

        int[] target1 = new int[nums.length];

        int idx = 0;
        for(int ele:target){
            target1[idx++] = ele;
        }
        return target1;
    }
}
