package Lecture10_Stacks;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack customStack = new CustomStack(5);

        customStack.push(90);
        customStack.push(80);
        customStack.push(70);
        customStack.push(60);
        customStack.push(50);


        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
//        System.out.println(customStack.pop());

    }
}
