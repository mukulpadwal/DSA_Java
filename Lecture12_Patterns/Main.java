package Lecture12_Patterns;

public class Main {
    public static void main(String[] args) {
        pattern28(5);
    }

    static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int row = 0; row < 2*n - 1; row++) {
            int totalColsInRows = row < n ? row + 1 : n - (row - n + 1);
            for (int col = 0; col < totalColsInRows; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int i = 0; i < 2*n -1; i++) {
            int starsOnEachCol = i < n ? i + 1 : n - (i - n + 1);
            int spaces = n - starsOnEachCol;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < starsOnEachCol; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    static void pattern(){

    }
}
