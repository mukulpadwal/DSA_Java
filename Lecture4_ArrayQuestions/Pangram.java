package Lecture4_ArrayQuestions;

import java.util.Arrays;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

public class Pangram {
    public static void main(String[] args) {
        int ch = 'z' - 'a';
        int digit = '2' - '0';

        System.out.println(ch);
        System.out.println(digit);

        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    static boolean checkIfPangram(String sentence) {
        int[] ch = new int[26];

        Arrays.fill(ch, 0);

        for(int i=0; i<sentence.length(); i++){
            int index = sentence.charAt(i) - 'a';

            ch[index]++;
        }

        for(int num: ch){
            if(num == 0){
                return false;
            }}

        return true;

    }
}
