package Lecture10_Queues;

public class CustomQueue {
    int[] queueArr;

    private static final int size = 20;

    private int end = 0;

    CustomQueue (){
        this(size);
    }

    CustomQueue (int size){
        this.queueArr = new int[size];
    }

    // 1st functionality will be to add things in the queue

    public boolean push(int item) throws Exception {
        if(isFull()){
            // If our queue is full we can't add any more elements in the queue
            throw new Exception("Can't add as the Queue is full");
        }

        queueArr[end++] = item;
        return true;

    }

    public boolean isFull(){
        return end == queueArr.length;
    }

    // 2nd Functionality will be to remove items from the queue

    public int pop() throws Exception {
       if(isEmpty()){
           // We can't remove elements from an empty array
           throw new Exception("Can't remove elements from an empty array");
       }

       int element = queueArr[0];

       for(int i=1; i<end; i++){
           queueArr[i-1] = queueArr[i];
       }

       end--;

       return element;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    // 3rd Functionality will be to check what is at the top of the queue
    public int peek() throws Exception {
        if(isEmpty()){
            // We can't peek elements from an empty array
            throw new Exception("Can't peek elements from an empty array");
        }

        return queueArr[0];
    }

    // 4th Functionality would be to print all the elements in the queue
    public void printQueue(){
        for (int i=0; i<end; i++){
            System.out.print(queueArr[i]+" <- ");
        }
        System.out.println("END");
    }
}
