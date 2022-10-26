package Lecture3_LinearSearch;


// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

public class EvenDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
    }

    static int findNumbers(int[] nums){
        int counter = 0;

        for(int num: nums){
            if(digitCount2(num)%2 == 0){
                counter++;
            }
        }

        return counter;
    }

    // One way is to count all the digits
    static int digitCount(int num){
        int count = 0;

        // to handle the negative number part
        if(num < 0){
            num = -1 * num;
        }

        while(num != 0){
            int rem = num%10;
            count++;
            num/=10;
        }

        return count;
    }

    // One way can be to convert the number into string and take its length

    static int digitCountString(int num){
        String nu = num + "";
        return nu.length();
    }

    // Shortcut to find number of digits

    static int digitCount2(int num){

        // to handle the negative number part
        if(num < 0){
            num = -1 * num;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
