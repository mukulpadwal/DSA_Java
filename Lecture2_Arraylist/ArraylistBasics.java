package Lecture2_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistBasics {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Syntax
        // ArrayList<datatype> variableName = new ArrayList<>(defaultSize);

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(69);
        list.add(79);
        list.add(89);
        list.add(8);

        // Internally the arraylist calls it's toString method
        System.out.println(list);

        // We can update an element also
        list.set(0,99);

        System.out.println(list);

        // We can remove an element also

        list.remove(0);

        System.out.println(list);

        // Input

        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

        // get item at any index

        list.get(0);


        // printing an arraylist

        // Method 1
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        // Method 2
        System.out.println(list);


        // Internal working of Arraylist
        // 1) Size is fixed internally
        // 2) Let's assume that arraylist is filled by some amount
        // It will create a new arraylist of say double the size
        // old elements are copied in the new arraylist
        // old arraylist is deleted

    }
}
