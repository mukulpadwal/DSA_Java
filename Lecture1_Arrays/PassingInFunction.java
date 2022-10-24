import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(nums));

        change(nums);

        System.out.println(Arrays.toString(nums));

        // This concept is known as mutable behaviour
        // Strings are immutable in java
        // Arrays are mutable in java

        // mutable in simple words means you can change the object
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
