import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
       // Creating a Scanner() object in order to take input from the user
       Scanner sc = new Scanner(System.in);

       // CASE 1 : Array of primitives
       // Manually putting data into the array
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // output : [1, 2, 3, 4, 5]
        System.out.println(arr[3]);

        // Input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Printing the output
        // Method 1 : using simple for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        // Method 2 : using for-each loop
        for (int num : arr) { // for every element in array, print the element
            System.out.print(num + " "); // here num represents element of the array
        }

        System.out.println();

        // Method 3 : using Arrays.toString(arr[]) method
        System.out.println(Arrays.toString(arr));


        // ArrayIndexOutOfBoundsException
        // when we try to access the index which is not present in the array
        // arr[5]

        // CASE 2 : Array of objects
        String[] str = new String[3];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
