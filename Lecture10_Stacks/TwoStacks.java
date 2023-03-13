package Lecture10_Stacks;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoStacks {

    public static int twoStacks(int max, List<Integer> a, List<Integer> b){
        return (twoStacks(max, a, b, 0, 0) - 1);
    }

    public static int twoStacks(int max, List<Integer> a, List<Integer> b, int sum, int count){
        if(sum > max){
            return count;
        }

        if(a.isEmpty() || b.isEmpty()){
            return count;
        }

        int leftEle = a.get(0);
        a.remove(0);
        int leftCall = twoStacks(max, a, b, sum+leftEle, count+1);

        int rightEle = b.get(0);
        b.remove(0);
        int rightCall = twoStacks(max, a, b, sum+rightEle, count+1);

        return Math.max(leftCall, rightCall);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int g = sc.nextInt();

        while (g != 0) {

            int n = sc.nextInt();

            int m = sc.nextInt();

            int maxSum = sc.nextInt();

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int aItem = sc.nextInt();
                a.add(aItem);
            }


            List<Integer> b = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                int bItem = sc.nextInt();
                b.add(bItem);
            }

            int result = twoStacks(maxSum, a, b);

            System.out.println(result);
            g--;
        }
    }
}
