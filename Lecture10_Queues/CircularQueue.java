package Lecture10_Queues;

public class CircularQueue{

    int[] queueArr;

    private static final int initialSize = 20;

    protected int start = 0;
    protected int end = 0;
    private int size = 0;

    CircularQueue (){
        this(initialSize);
    }

    CircularQueue (int size){
        this.queueArr = new int[size];
    }

    public boolean push(int item) throws Exception {
        if(isFull()){
            throw new Exception("Can't add in full queue");
        }

        queueArr[end++] = item;
        end = end % queueArr.length;
        size++;
        return true;
    }

    public boolean isFull(){
        return size == queueArr.length;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't remove from an empty queue");
        }

        int eleRem = queueArr[start++];
        start = start % queueArr.length;
        size--;
        return eleRem;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int front(){
        return queueArr[start];
    }

    public void printQueue(){
        int i = start;

        do{
            System.out.print(queueArr[i]+" -> ");
            i++;
            i = i % queueArr.length;
        } while (i != end);
        System.out.println("END");
    }
}
