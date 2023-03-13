package Lecture10_Queues;

public class DynamicQueue extends CustomQueue{
    DynamicQueue (){
        super();
    }

    DynamicQueue (int size){
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

            queueArr = temp;
        }

        return super.push(item);
    }
}
