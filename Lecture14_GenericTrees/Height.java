package Lecture14_GenericTrees;

import static Lecture14_GenericTrees.Main.createTree;

public class Height {
    public static int heightEdges(Main.Node root){
        int height = -1; // We are calculating in terms of number of edges

        for (Main.Node children: root.children){
            int childHeight = heightEdges(children);
            height = Math.max(height, childHeight);
        }

        height += 1;

        return height;
    }

    public static int heightNodes(Main.Node root){
        int height = 0; // We are calculating in terms of number of nodes

        for (Main.Node children: root.children){
            int childHeight = heightNodes(children);
            height = Math.max(height, childHeight);
        }

        height += 1;

        return height;
    }


    public static void main(String[] args) {
        Main.Node root = createTree(new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1});
        System.out.println(heightEdges(root));
        System.out.println(heightNodes(root));
    }
}
