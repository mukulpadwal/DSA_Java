package Lecture14_GenericTrees;
import static Lecture14_GenericTrees.Main.createTree;

public class Size {
    public static int size(Main.Node root){
        int size = 0;

        for(Main.Node child: root.children){
            int childSize = size(child);
            size += childSize;
        }

        size += 1;
        return size;
    }

    public static void main(String[] args) {
        Main.Node root = createTree(new int[]{10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1});
        System.out.println(size(root));
    }
}
