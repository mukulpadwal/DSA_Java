package Lecture3_LinearSearch;

// https://leetcode.com/problems/richest-customer-wealth/

import java.util.ArrayList;

public class RichestCustomer {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,5}, {7,3}, {3,5}}));
    }

    static int maximumWealth(int[][] accounts) {
        ArrayList<Integer> ans = new ArrayList<>();

        for(int[] customer: accounts){
            int totalWealth = 0;
            for(int money: customer){
                totalWealth += money;
            }
            ans.add(totalWealth);
        }

        return maxi(ans);
    }

    static int maxi(ArrayList<Integer> ans){
        int maxMoney = Integer.MIN_VALUE;

        for(int ele: ans){
            maxMoney = Math.max(maxMoney, ele);
        }

        return maxMoney;
    }

    // Optimization can also be done
    // we can perform this maxi check in the main code itself

    static int optimizedMaximumWealth(int[][] accounts) {
        int maxMoney = Integer.MIN_VALUE;

        for(int[] customer: accounts){
            int totalWealth = 0;
            for(int money: customer){
                totalWealth += money;
            }
            maxMoney = Math.max(maxMoney, totalWealth);
        }

        return maxMoney;
    }
}
