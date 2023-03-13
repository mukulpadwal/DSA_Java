package Lecture13_Recursion;

import java.util.ArrayList;

public class MazeDiagonal {
    public static void main(String[] args) {
        System.out.println(countPath(0,0));
        printPath("", 0, 0);
        System.out.println(retPath("",0,0));
    }

    // Here we can move in 3 directions Vertically, Horizontally, Diagonally

    static int countPath(int r, int c){
        if(r == 2 || c == 2){
            return 1;
        }


        int mid = countPath(r + 1, c + 1);
        int left = countPath(r+1, c);
        int right = countPath(r, c+1);

        return mid + left + right;
    }

    static void printPath(String p, int r, int c){
        if(r==2 && c==2){
            System.out.println(p);
            return;
        }

        //yaha pe hum diagnal ka case dekhte hai
        if(r < 2 && c < 2){
            printPath(p+"D", r +1, c+1);
        }

        // yaha pe Horizintal
        if(r < 2){
            printPath(p+"H", r+1, c);
        }

        // yaha pe vertical
        if(c < 2){
            printPath(p+"V", r, c+1);
        }
    }

    static ArrayList<String> retPath(String p, int r, int c){
        if(r==2 && c==2){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        //yaha pe hum diagnal ka case dekhte hai
        if(r < 2 && c < 2){
            ans.addAll(retPath(p+"D", r +1, c+1));
        }

        // yaha pe Horizintal
        if(r < 2){
            ans.addAll(retPath(p+"H", r+1, c));
        }

        // yaha pe vertical
        if(c < 2){
            ans.addAll(retPath(p+"V", r, c+1));
        }

        return ans;
    }
}
