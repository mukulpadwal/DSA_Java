package Lecture13_Recursion;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;

        boolean[][] board = new boolean[n][n];

        knight(board, 0,0, n);
    }

    static void knight(boolean[][] board, int row, int col, int k){
        // Base Case
        // As the knight moves in L shape direction, so we need to check each and every possibility.
        // As in Queen problem we could only keep one keep in a particular row or col as it can attack it all the directions.
        // In case of Knights the attack is different.

        if(k == 0){
            display(board);
            System.out.println();
            return;
        }

        // This is a check if we have gone out of our array
        if(row == board.length - 1 && col == board.length){
            return;
        }

        // If we are not able to place a knight in any particular row we move to the next one
        if(col == board.length){
            knight(board, row+1, 0, k);
            return;
        }

        if(isPossible(board, row, col)){
            board[row][col] = true;
            knight(board, row, col+1, k-1);
            board[row][col] = false;
        }

        knight(board, row, col+1, k);

    }

    static boolean isPossible(boolean[][] board, int row, int col){

        // Here we have total 4 out of 8 cases to check wether it is safe to place the knight or not

        // Case 1: [row - 2, col + 1]
        // |->
        // |

        if(isValidRange(board, row - 2, col + 1)){
            if(board[row - 2][col + 1]){
                return false;
            }
        }

        // Case 2: [row - 2, col - 1]
        // <-|
        //   |

        if(isValidRange(board, row - 2, col - 1)){
            if(board[row-2][col-1]){
                return false;
            }
        }

        // Case 3: [row - 1, col + 2]
        //  ^
        // __

        if(isValidRange(board, row - 1, col + 2)){
            if(board[row - 1][col + 2]){
                return false;
            }
        }

        // Case 4: [row - 1, col - 2]
        // ^
        // __

        if(isValidRange(board, row - 1, col - 2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

        return true;
    }

    static boolean isValidRange(boolean[][] board, int row, int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }

        return false;
    }

    static void display(boolean[][] board){
        // Let's Display
        for(boolean[] arr : board){
            for (boolean ele: arr){
                if(ele){
                    System.out.print("K");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
