package Lecture13_Recursion;

import java.util.Arrays;

public class MazePathPrint {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                {true, true, true},
                {true, true, true}};

        int[][] path = new int[maze.length][maze[0].length];

        printPathMatrix(0,0, maze, "", path, 1);
    }

    static void printPathMatrix(int r, int c, boolean[][] maze, String p, int[][] path, int level){
        // Base Case
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = level;
            for (int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = level;

        if(r < maze.length - 1){
            printPathMatrix(r+1, c, maze, p+"D", path, level+1);
        }

        if(c < maze[0].length - 1){
            printPathMatrix(r, c+1, maze, p+"R", path, level+1);
        }

        if(r > 0){
            printPathMatrix(r-1, c, maze, p+"U", path, level+1);
        }

        if(c > 0){
            printPathMatrix(r, c-1, maze, p+"L", path, level+1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
