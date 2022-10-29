package Lecture4_ArrayQuestions;

// https://leetcode.com/problems/transpose-matrix/description/

public class TransposeMatrix {
    public static void main(String[] args) {
        
    }

    static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] ans = new int[n][m];

        for(int i=0; i<n ;i++){
            for(int j=0; j<m; j++){
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;

    }
}
