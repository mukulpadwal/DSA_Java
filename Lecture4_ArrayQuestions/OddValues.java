package Lecture4_ArrayQuestions;

// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/

public class OddValues {
    public static void main(String[] args) {
        System.out.println(oddCells(2, 3, new int[][]{{0,1},{1,1}}));
    }

    static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];

        for(int[] index: indices){
            int rowIndex = index[0];
            int colIndex = index[1];

            // Loop to increment row
            for(int i=0; i<n; i++){
                ans[rowIndex][i]++;
            }

            // Loop to increment column
            for(int j=0; j<m; j++){
                ans[j][colIndex]++;
            }
        }

        int counter = 0;

        for(int[] arr: ans){
            for(int ele: arr){
                if(ele%2 != 0){
                    counter++;
                }
            }
        }

        return counter;
    }
}
