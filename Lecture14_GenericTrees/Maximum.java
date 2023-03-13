package Lecture14_GenericTrees;

import java.util.Stack;

public class Maximum {
    public static int maxi(Main.Node root){
        int maxi = Integer.MIN_VALUE;

        for(Main.Node child: root.children){
            int childMax = maxi(child);
            maxi = Math.max(childMax, maxi);
        }

        maxi = Math.max(root.data, maxi);

        return maxi;
    }
    public static void main(String[] args) {
        Main.Node root = createTree(new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1});
        System.out.println(maxi(root));
    }

    private static Main.Node createTree(int[] ints) {
        Main.Node root = null;
        Stack<Main.Node> st = new Stack<>();

        for(int ele: ints){
            if(ele == -1){
                st.pop();
            } else {
                Main.Node newNode = new Main.Node();
                newNode.data = ele;

                if(st.isEmpty()){
                    root = newNode;
                } else {
                    st.peek().children.add(newNode);
                }
                st.push(newNode);
            }
        }

        return root;
    }
}
