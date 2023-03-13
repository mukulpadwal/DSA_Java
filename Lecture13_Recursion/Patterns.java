package Lecture13_Recursion;

public class Patterns {
    public static void main(String[] args) {
//    triangle1(3,0);
    triangle2(4);
    }

    /*
     *
     *
     * */
    static void triangle1(int row, int col){
        // Base Condition
        if(row == 0){
            return;
        }

        if(col < row){
            System.out.print("*");
            triangle1(row, col+1);
        }
        else {

            System.out.println();
            triangle1(row-1, 0);

        }
    }

    static void triangle2(int n){
        helper(0, 0, n);
    }

    static void helper(int row, int col, int n){
        // Base Condition
        if(row == n){
            return;
        }

        if(col <= row){
            System.out.print("*");
            helper(row, col+1, n);
        } else {
            System.out.println();
            helper(row+1, 0, n);
        }
    }
}
