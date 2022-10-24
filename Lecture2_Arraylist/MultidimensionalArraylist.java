package Lecture2_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArraylist {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initially it is going to be empty so lets add 3 lists to it

        // initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // get the list at index i and add something to it
                list.get(i).add(in.nextInt());
            }
        }

        // print out the list
        System.out.println(list);
    }
}
