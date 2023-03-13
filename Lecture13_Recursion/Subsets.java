package Lecture13_Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
//        subset("abc","");
        System.out.println(subsetRet("ab",""));
    }

    static void subset(String str, String ans){
        // Base Condition
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        // Logic
        char ch = str.charAt(0);
        // Yaha include kar lete
        subset(str.substring(1), ans + ch);
        // Yaha nahi karte
        subset(str.substring(1), ans);
    }

    static ArrayList<String> subsetRet(String str, String ans){
        // Base Condition
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        // Logic
        char ch = str.charAt(0);

        ArrayList<String> left = subsetRet(str.substring(1), ans+ch);
        // Yaha nahi karte
        ArrayList<String> right = subsetRet(str.substring(1), ans);

        left.addAll(right);

        return left;

    }
}
