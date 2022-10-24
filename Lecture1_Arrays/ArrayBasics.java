package Lecture1_Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        // Use Case : Store Roll number and Names of students

        // Case 1 : We need to store only one roll number and name
        // Way 1 : initialize single variables for roll number and names
        int rollNo = 1910990983;
        String name = "Mukul Padwal";

        // Case 2 : We need to store 5 roll number
        // Way 1 : we can create 5 separate variables to store them bur that would not be effective

        // Way 2 : we can create an array of integer and string to store rollNo and names respectively
        int[] rollNoArray = {1,2,3,4,5};
        String[] namesArray = {"Mukul", "Gagan", "Akshat", "Anmol", "Korusuke"};

        // Ques : What is an Array?
        // Ans : An array is basically a collection of datatypes (can be primitives or objects or complex datatypes)

        // Note : All the type of data stored in array should be of same type

        // Syntax
        // datatype[] variableName = new datatype[size]
        // variableName -> reference variable
        // new datatype[size] -> object

        int[] rollNum = new int[5];

        // let's break down
        // int[] rollNum; -> declaration of array. Here rollNum is getting defined in the stack memory.
        // ros = new int[]; -> initialisation. Actually here object is being created in the heap memory.

        // The things that are on the left side of the equals to happens at compile time
        // The things that are on the right side happens at run time (dynamic memory allocation)

        // What is Dynamic Memory Allocation?
        // Assigning the memory space during the execution time or at the run time.

        // In c/c++ arrays are stored in a continuous manner
        // But in java it entirely depends on JVM whether the array will be continuous or not
        // WHY???
        // 1) Array objects are stored in heap.
        // 2) Heap objects are not continuous.
        // 3) Dynamic memory allocation.
        // hence array objects in java may not be continuous.

        // Index of array
        System.out.println(rollNoArray[0]+" "+namesArray[0]);

        // new keyword : it is used to create an object

        // Inside integer array default value is 0 and in string array it is null

        // What is null in java?
        // it is not a datatype, it is a special literal in java.
        // you can only assign null to non-primitives
        // any reference variable that you have by default it is going to have the null type.

        // primitives are stored in the stack memory only
        // but all the other objects are stored in the heap memory

    }
}
