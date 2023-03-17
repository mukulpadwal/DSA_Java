package Lecture2_Arraylist;

import java.util.ArrayList;

public class TvChannel {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
            list.add(i);
        }

        int index = 0;

        while (list.size() != 1){
            for(int i=1; i<k; i++){
                index++;
                if(index == list.size()){
                    index = 0;
                }
            }


            list.remove(index);
        }

        System.out.println(list);
    }
}
