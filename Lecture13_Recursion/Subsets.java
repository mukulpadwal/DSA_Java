package Lecture13_Recursion;


import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
    public static void main(String[] args) {
        // Suppose we have to return all the possible subsets of the string "abc"
        // { "a", "b", "c", "ab", "bc", "ca", "abc", ""}

        // How can we do that

        // Method 1 : Let's print the output
        printSubset("abc", "");

        // Method 2 : Now if we want that we should get an arraylist as an output
        ArrayList<String> list = new ArrayList<>();
        printSubset("abc", "", list);
        // The list which we pass here works on the concept of single object and multiple reference variables
        System.out.println(list);

        // Method 3 : If we want to return ArrayList as an answer
        System.out.println(printSubsetList("abc", ""));
    }

    // Method 1
    static void printSubset(String up, String p){
        // Here comes our base case
        // When our up string becomes empty that is the time, where we print the output and return
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        // Let's take the first element in our p string
        char ch = up.charAt(0);
        printSubset(up.substring(1), p + ch);

        // Here we will not take that character in our subset
        printSubset(up.substring(1), p);
    }

    // Method 2

    static void printSubset(String up, String p, ArrayList<String> list){
        // Here will be our base case
        if(up.isEmpty()){
            list.add(p);
            return;
        }

        // Let's take the first element in our p string
        char ch = up.charAt(0);
        printSubset(up.substring(1), p + ch, list);

        // Here we will not take that character in our subset
        printSubset(up.substring(1), p, list);
    }

    // Method 3
    static ArrayList<String> printSubsetList(String up, String p){
        // Here base case when our up becomes empty
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Here we will create a local array list that will be for this particular function call only
        ArrayList<String> ans = new ArrayList<>();

        char ch = up.charAt(0);
        ans.addAll(printSubsetList(up.substring(1), p + ch));

        ans.addAll(printSubsetList(up.substring(1), p));

        return ans;
    }
}
