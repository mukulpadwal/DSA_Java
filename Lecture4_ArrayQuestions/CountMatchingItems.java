package Lecture4_ArrayQuestions;

// https://leetcode.com/problems/count-items-matching-a-rule/description/

import java.util.ArrayList;
import java.util.List;

public class CountMatchingItems {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            items.add(new ArrayList<>());
        }

        items.get(0).add("phone");
        items.get(0).add("blue");
        items.get(0).add("pixel");
        items.get(1).add("computer");
        items.get(1).add("silver");
        items.get(1).add("lenovo");
        items.get(2).add("phone");
        items.get(2).add("gold");
        items.get(2).add("gold");

        System.out.println(countMatches(items, "color", "silver"));

    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;

        for(List<String> list: items){
            if(ruleKey.equals("type")){
                if(list.get(0).equals(ruleValue)){
                    counter++;
                }
            }

            if(ruleKey.equals("color")){
                if(list.get(1).equals(ruleValue)){
                    counter++;
                }
            }

            if(ruleKey.equals("name")){
                if(list.get(2).equals(ruleValue)){
                    counter++;
                }
            }


        }

        return counter;
    }
}
