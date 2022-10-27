package Lecture4_ArrayQuestions;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int max = maxCandy(candies);
        for(int i=0; i<candies.length; i++){
            int fullCandy = candies[i] + extraCandies;
            if(fullCandy >= max){
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }

    static int maxCandy(int[] candies){
        int maxi = Integer.MIN_VALUE;

        for(int candy: candies){
            maxi = Math.max(maxi, candy);
        }

        return maxi;
    }
}
