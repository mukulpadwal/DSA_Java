package Lecture13_Recursion;

public class Strings {
    public static void main(String[] args) {
        System.out.println(skipA2("abca"));
    }

    static String skipA(String str){
        String ans = "";
        int i = 0;
        return helper(str, ans, i);
    }

    static String helper(String str, String ans, int i){
        if(i == str.length()){
            return  ans;
        }

        if(str.charAt(i) == 'a'){
            return helper(str, ans, i+1);
        }

        return helper(str, ans+str.charAt(i), i+1);
    }

    static String skipA2(String str){
        // Base Condition
        if(str.isEmpty()){
            return "";
        }

        char ch = str.charAt(0);

        if(ch == 'a'){
            return skipA2(str.substring(1));
        } else {
            return ch + skipA2(str.substring(1));
        }
    }
}
