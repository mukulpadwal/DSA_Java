package Lecture4_ArrayQuestions;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        System.out.println("Real Image");
        for (int[] im: image) {
            System.out.println(Arrays.toString(im));
        }

        flipAndInvertImage(image);

        System.out.println("Flipped Image");
        for (int[] im: image) {
            System.out.println(Arrays.toString(im));
        }

    }

    static int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr: image){
            int start = 0;
            int end = arr.length-1;

            while(start < end){
                swap(arr, start++, end--);
            }
        }

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                if(image[i][j] == 0){
                    image[i][j] = 1;
                } else {
                    image[i][j] = 0;
                }
            }
        }

        return image;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
