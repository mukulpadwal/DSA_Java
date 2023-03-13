package Lecture10_Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue customQueue = new CustomQueue(5);
//
//        customQueue.push(1);
//        customQueue.push(2);
//        customQueue.push(3);
//        customQueue.push(4);
//        customQueue.push(5);
//
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();

//        CircularQueue circularQueue = new CircularQueue(5);
//
//        circularQueue.push(1);
//        circularQueue.push(2);
//        circularQueue.push(3);
//        circularQueue.push(4);
//        circularQueue.push(5);
//
//        circularQueue.printQueue();
//        System.out.println(circularQueue.pop());
//        circularQueue.printQueue();
//        System.out.println(circularQueue.pop());
//        circularQueue.printQueue();
//
//        circularQueue.push(6);
//
//
//        System.out.println(circularQueue.pop());
//        circularQueue.printQueue();
//        System.out.println(circularQueue.pop());
//        circularQueue.printQueue();
//        System.out.println(circularQueue.pop());
//        circularQueue.printQueue();

//        DynamicQueue customQueue = new DynamicQueue(5);
//
//        customQueue.push(1);
//        customQueue.push(2);
//        customQueue.push(3);
//        customQueue.push(4);
//        customQueue.push(5);
//        customQueue.push(8);
//
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();
//        System.out.println(customQueue.pop());
//        customQueue.printQueue();

        DynamicCircularQueue circularQueue = new DynamicCircularQueue(5);

        circularQueue.push(1);
        circularQueue.push(2);
        circularQueue.push(3);
        circularQueue.push(4);
        circularQueue.push(5);
        circularQueue.push(6);

        circularQueue.printQueue();
        System.out.println(circularQueue.pop());
        circularQueue.printQueue();
        System.out.println(circularQueue.pop());
        circularQueue.printQueue();

        circularQueue.push(7);


        System.out.println(circularQueue.pop());
        circularQueue.printQueue();
        System.out.println(circularQueue.pop());
        circularQueue.printQueue();
        System.out.println(circularQueue.pop());
        circularQueue.printQueue();
    }
}
