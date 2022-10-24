package Lecture1_Arrays;

public class SpecialColumnCase {
    public static void main(String[] args) {
        // As column size is not mandatory to mention so when we go to print the two-dimensional array we don't know what size of column to mention.

        int[][] arr = {{1,2,3}, // 0th index
                {3}, // 1st index
                {5,8,9,0}}; // 2nd index

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
