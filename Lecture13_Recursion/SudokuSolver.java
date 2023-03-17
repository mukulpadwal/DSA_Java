package Lecture13_Recursion;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board =  {  {7, 0, 0, 0, 0, 0, 2, 0, 0},
                            {4, 0, 2, 0, 0, 0, 0, 0, 3},
                            {0, 0, 0, 2, 0, 1, 0, 0, 0},
                            {3, 0, 0, 1, 8, 0, 0, 9, 7},
                            {0, 0, 9, 0, 7, 0, 6, 0, 0},
                            {6, 5, 0, 0, 3, 2, 0, 0, 1},
                            {0, 0, 0, 4, 0, 9, 0, 0, 0},
                            {5, 0, 0, 0, 0, 0, 1, 0, 6},
                            {0, 0, 6, 0, 0, 0, 0, 0, 8}
                        };

        System.out.println(solve(board));

        for(int[] row: board){
            for(int ele: row){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

    static boolean solve(int[][] board){
        // Let's find the length of the board first
        int n = board.length;

        // Initially lets assume that our r and c which will tell us the location of empty cell are -1
        int r = -1;
        int c = -1;

        // Now lets traverse through the entire board and find out the empty spaced in this case empty spaces are rep by 0

        // Initially lets assume that there are some empty cells there in the sudoku
        boolean isEmpty = true;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 0) {
                    // This means that we have found out an empty cell
                    r = i;
                    c = j;
                    // These r and c will be used to place each and every number from 1 to 9

                    // As we have found this cell to be empty, so we are going to place a number here and hence it will not remain empty anymore
                    isEmpty = false;
                    break;
                }
            }

            // We have found one empty space in this particular row, so we won't move ahead
            if(!isEmpty){
                // This means that we have found empty space
                break;
            }
        }

        // After traversing all the rows if the value of isEmpty is true it means that there is no empty space left now
        if (isEmpty){
            // We have solved our sudoku
            return true;
        }


        // Now here lets start filing numbers from 1 to 9 and check wether it is safe to place it there or not
        for (int i = 1; i<= n; i++){
            if(isSafe(board, r, c, i)){
                board[r][c] = i;
                // Let's Solve further sudoku with this number
                if(solve(board)){
                    return true;
                } else {
                    // Back track that particular number is not an answer
                    board[r][c] = 0;
                }
            }
        }

        // If after all the above numbers are tried, and we did not find any answer, so it is guaranteed that the sudoku can't be solved
        return false;
    }

    static boolean isSafe(int[][] board, int r, int c, int num){
        // For a particular number we have to check three cases

        // Case 1: In that particular row
        for(int i=0; i<board.length; i++){
            if(board[r][i] == num){
                // We can't place that number there
                return false;
            }
        }

        // Case 2: In that particular column
        for(int i=0; i<board.length; i++){
            if(board[i][c] == num){
                // We can't place that number there
                return false;
            }
        }

        // Case 3: in that particular box
        // for that we need to find the starting point of that 3x3 matrix
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = r - (r % sqrt);
        int colStart = c - (c % sqrt);

        for (int i = rowStart; i < rowStart + sqrt; i++){
            for(int j= colStart; j < colStart + sqrt; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }

        // It is safe to put the number
        return true;
    }
}
