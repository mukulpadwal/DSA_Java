package Lecture10_Stacks;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
public class MinInsertion {
    public static void main(String[] args) {
        System.out.println(minInsertions("())"));
//        datatype[] name = new datatype[size]
        Set<Integer>[] s = new Set[5];
    }

    public static int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int counter = 0;

        int i = 0;

        while(i < s.length()){
            char ch = s.charAt(i);

            if(ch == '('){
                stack.push(ch);
                i++;
            }

            if(ch == ')'){
                if(stack.isEmpty()){
                    stack.push('(');
                    counter++;
                }

                if(i == s.length()-1){
                    counter++;
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                    i++;
                }

                char nextCh = ' ';
                if(i+1 < s.length()){
                    i++;
                    nextCh = s.charAt(i);
                }



                if(!stack.isEmpty() && nextCh == ')' && stack.peek() == '('){
                    stack.pop();
                    i++;
                }

                if(!stack.isEmpty() && nextCh == '(' && stack.peek() == '('){
                    counter++;
                    stack.pop();
                    stack.push(nextCh);
                }


            }
        }

        while(!stack.isEmpty()){
            counter += 2;
            stack.pop();
        }

        return counter;
    }
}
