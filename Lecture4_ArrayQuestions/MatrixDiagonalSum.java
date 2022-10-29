package Lecture4_ArrayQuestions;

// https://leetcode.com/problems/matrix-diagonal-sum/description/

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}}));
    }

    static int diagonalSum(int[][] mat) {
        int sum = 0;

        // Primary Diagonal Sum
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(i == j){sum += mat[i][j];}
            }
        }

        // Secondary Diagonal Sum
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                if(j == mat[i].length - i - 1 && i != j){sum += mat[i][j];}
            }
        }

        return sum;
    }
}
