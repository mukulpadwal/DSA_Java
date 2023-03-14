package Lecture13_Recursion;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;

        boolean[][] board = new boolean[n][n];

        System.out.println(count(board, 0));
    }

    static int count(boolean[][] board, int row) {
        // Base Case
        // Here we are placing queen row by row so if we reach the end of any row that would be our base case

        if (row == board.length) {
            // We will display the ways we placed our queens and return the count
            display(board);
            System.out.println();
            return 1;
        }

        // This variable is to keep count of number of ways we can place our queen
        int counter = 0;

        // Here We will check for each cell
        for (int col=0; col < board[0].length; col++){
            // If the particular cell is safe to place the queen we will move to next row
            if(isSafe(board, row, col)){
                board[row][col] = true; // this signifies that we have placed the queen at this particular cell
                counter += count(board, row+1);
                board[row][col] = false; // While coming back we make sure to revert the changes so that future calls don't have nay problem
            }
        }

        return counter;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // From common sense we know that in a particular row there can only be one queen
        // And if we are at any particular cell we know that there are queens only in the above cells so we need to check only in 3 directions

        // Case 1: Upwards
        for(int i=0; i< row; i++){
            if(board[i][col]){
                return false;
            }
        }

        // Case 2: Left Diagonal
        // For this first we need to find what is the maximum length in left side we can travel
        int maxLeft = Math.min(row, col);

        for (int i=1; i<=maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // Case 3: Right Diagonal
        // For this also we need to calculate how much maximum distance can our queen travel
        int maxRight = Math.min(row, board.length - col - 1);

        for(int i=1; i<=maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
