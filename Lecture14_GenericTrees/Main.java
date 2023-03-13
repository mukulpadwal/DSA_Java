package Lecture14_GenericTrees;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static Node createTree(int[] arr){
        Node root = null;

        Stack<Node> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == -1){
                stack.pop();
            } else {
                // Creating a new Node
                Node newNode = new Node();
                newNode.data = arr[i];

                if(stack.isEmpty()){
                    root = newNode;
                } else {
                    stack.peek().children.add(newNode);
                }

                stack.push(newNode);
            }
        }

        return root;
    }

    public static void printTree(Node root){
        String str = root.data + " -> ";
        for(Node child: root.children){
            str += child.data + ",";
        }
        str += ".";
        System.out.println(str);

        // Recursion Call
        for(Node child: root.children){
            printTree(child);
        }
    }

    public static void main(String[] args) {

        Node root = createTree(new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1});

        printTree(root);

    }
}
