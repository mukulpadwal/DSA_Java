package Lecture10_Queues;

public class DynamicCircularQueue extends CircularQueue{
    DynamicCircularQueue (){
        super();
    }

    DynamicCircularQueue (int size){
        super(size);
    }

    @Override
    public boolean push(int item) throws Exception {
        if(isFull()){
            // Here we are increasing the size of array
            int[] temp = new int[queueArr.length * 2];

            // Here we will copy the elements
            for(int i=0; i<queueArr.length; i++){
                temp[i] = queueArr[i];
            }

            start = 0;
            end = queueArr.length;
            queueArr = temp;
        }

        return super.push(item);
    }
}
