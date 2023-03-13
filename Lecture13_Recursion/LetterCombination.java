package Lecture13_Recursion;

public class LetterCombination {
    public static void findCombinations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';

        for(int i=(digit-1) * 3; i< digit*3; i++){
            char charToAdd = (char) ('a' + i);
            findCombinations(p + charToAdd, up.substring(1));
        }
    }

    public static void main(String[] args) {
        String str1 = "12";

        findCombinations( "", str1);

    }
}
