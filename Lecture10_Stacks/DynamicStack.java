package Lecture10_Stacks;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) throws Exception {
        if(isFull()){
            // Double the size of array
            int[] temp = new int[stackArr.length * 2];

            for(int i=0; i<stackArr.length; i++){
                temp[i] = stackArr[i];
            }

            stackArr = temp;
        }
        return super.push(item);
    }
}
