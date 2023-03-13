package Lecture13_Recursion;
import java.util.ArrayList;

public class DiceRoll {
    public static void findCombinations(int target, String p){
            if(target == 0){
                System.out.println(p);
                return;
            }

            for(int i=1; i<=6 && i<= target; i++){
                findCombinations(target - i, p+i);
            }

    }

    public static ArrayList<Integer> findCombinationsRet(int target, String p){
        if(target == 0){
            ArrayList<Integer> ans= new ArrayList<>();
            ans.add(Integer.valueOf(p));
            return ans;
        }

        ArrayList<Integer> output = new ArrayList<>();

        for(int i=1; i<=6 && i<= target; i++){
            output.addAll(findCombinationsRet(target - i, p+i));
        }

        return output;

    }

    public static void main(String[] args) {
        // target can be between 1 and 6 both inclusive

        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        findCombinations(target, "");
        System.out.println(findCombinationsRet(target, ""));

    }
}
