import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Use Case
        /*
        Suppose we want to print something like this

         1 2 3
         4 5 6
         7 8 9
         */

        // Syntax
        // datatype[][] variableName = new datatype[row][col]
        // declaring the number of rows is necessary
        // number of col are not mandatory to specify

        // Method 1
        int[][] arr = {{1, 2, 3}, // 0th index
                       {4, 5, 6}, // 1st index
                       {7, 8, 9}}; // 2nd index

        int[][] arr1 = {{1,2,3}, // 0th index
                        {3}, // 1st index
                        {5,8,9,0}}; // 2nd index

        // Method 2
        int[][] arr2D = new int[3][3];

        System.out.println(arr2D.length); // this will give me number of rows


        // Input

        for(int row = 0; row < arr2D.length; row++){
            // for each column in every row
            for(int col = 0; col < arr2D[row].length; col++){
                arr2D[row][col] = in.nextInt();
            }
        }

        // Output

        // Method 1
        for(int row = 0; row < arr2D.length; row++){
            // for each column in every row
            for(int col = 0; col < arr2D[row].length; col++){
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }

        // Method 2
        for(int row = 0; row < arr2D.length; row++){
            System.out.println(Arrays.toString(arr2D[row]));
        }

        // Method 3
        for(int[] ele:arr2D){
            System.out.println(Arrays.toString(ele));
        }

    }
}
