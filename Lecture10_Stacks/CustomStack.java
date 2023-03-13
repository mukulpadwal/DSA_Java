package Lecture10_Stacks;

public class CustomStack {
    int[] stackArr;
    private static final int size = 20;
    int ptr = -1;

    CustomStack (){
        this(size);
    }

    CustomStack (int size){
        this.stackArr = new int[size];
    }

    // First functionality is to add items to the stack

    public boolean push(int item) throws Exception {

        if(isFull()){
            throw new Exception("Can't add item into a full stack");
        }

        ptr++;
        stackArr[ptr] = item;
        return true;
    }

    public boolean isFull(){
        return ptr == stackArr.length - 1;
    }

    // Second functionality is to remove items from the stack

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Can't remove item from an empty stack");
        }

        return stackArr[ptr--];
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    // Third Functionality is to see what is at the top of the stack

    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("Can't peek from an empty stack");
        }

        return stackArr[ptr];
    }

}
