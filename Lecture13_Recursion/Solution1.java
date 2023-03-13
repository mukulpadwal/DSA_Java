package Lecture13_Recursion;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(countZeros(0));
    }

    // Palindrome
    static boolean palindrome(int num){
        return helper(num,0,Integer.toString(num).length()-1);
    }

    private static boolean helper(int num, int s, int e) {
        if(s > e){
            return true;
        }

        if(Integer.toString(num).charAt(s) == Integer.toString(num).charAt(e)){
            return helper(num, s+1, e-1);
        }

        return false;
    }

    static int countZeros(int num){
        if(num == 0){
            return 1;
        }
        return helper1(num, 0);
    }

    static int helper1(int num, int count){
        if(num == 0){
            return count;
        }

        if(num%10 == 0){
            return helper1(num/10, count+1);
        }

        return helper1(num/10, count);
    }


}
