package Lecture13_Recursion;

public class PredictWinner {
    public static void main(String[] args) {
        int[] nums = {1,567,1,1};

        solve(0,0,nums, 0, nums.length - 1, 1);
    }

    static void solve(int p1, int p2, int[] nums, int i, int j, int turn){
        // Base Case
        if(i == j){
            if(turn % 2 != 0){
                p1 += nums[i];
            }

            if(turn % 2 == 0){
                p2 += nums[i];
            }

            System.out.println(p1 >= p2);
            return;
        }


        int leftChoice = nums[i];
        int rightChoice = nums[j];

//         boolean finalAns1 = false;
//         boolean finalAns2 = false;

        // Let's start from player 1
        if(turn % 2 != 0){
            // Player 1 turn
            // he has two choices
            solve(p1 + leftChoice, p2, nums, i+1, j, turn+1);
            solve(p1 + rightChoice, p2, nums, i, j-1, turn+1);

//            finalAns1 =  left || right;
        }

         if(turn % 2 == 0){
        // Player 2 turn
            solve(p1, p2 + leftChoice, nums, i+1, j, turn+1);
            solve(p1, p2 + rightChoice, nums, i, j-1, turn+1);

//            finalAns2 = left || right;
         }

//         return finalAns1 && finalAns2;


        // boolean p1Left = solve(p1 + leftChoice, p2, nums, i+1, j, turn+1);
        // boolean p2Right = solve(p1, p2 + rightChoice, nums, i, j-1, turn+1);
        // boolean p1Rright = solve(p1 + rightChoice, p2, nums, i, j-1, turn+1);
        // boolean p2Left = solve(p1, p2 + leftChoice, nums, i+1, j, turn+1);


        // return p1Left || p2Right || p1Rright || p2Left;
    }
}
