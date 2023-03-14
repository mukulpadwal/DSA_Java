package Lecture13_Recursion;

import java.util.ArrayList;

public class MazeRestriction {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                            {true, false, true},
                            {true, true, true}};

        // Here false means we cannot move from that particular path
        // Currently we are allowed to only move in 2 directions down and right

        System.out.println(pathCount(0,0, maze));

        pathPrint(0,0, maze, "");

        System.out.println(pathRet(0,0, maze, ""));


    }

    static int pathCount(int row, int col, boolean[][] maze){
        // Base Case
        if(row == maze.length - 1 || col == maze[0].length - 1){
            return 1;
        }

        // Here We will check if the path is valid or not
        if(!maze[row][col]){
            return 0;
        }

        // Here we will make calls for going downward
        int down = pathCount(row+1, col, maze);


        // Here we will make calls for going right
        int right = pathCount(row, col+1, maze);


        return down + right;
    }

    static void pathPrint(int r, int c, boolean[][] maze, String p){

        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        // River Checking time
        if(!maze[r][c]){
            return;
        }

        // Going down
        if(r < maze.length - 1){
            pathPrint(r+1, c, maze, p + "D");
        }

        // Going Right
        if(c < maze[0].length - 1){
            pathPrint(r, c+1, maze, p+"R");
        }

    }

    static ArrayList<String> pathRet(int r, int c, boolean[][] maze, String p){

        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        // River Checking time
        if(!maze[r][c]){
            return new ArrayList<>();
        }

        // Going down
        if(r < maze.length - 1){
            ans.addAll(pathRet(r+1, c, maze, p + "D"));
        }

        // Going Right
        if(c < maze[0].length - 1){
            ans.addAll(pathRet(r, c+1, maze, p+"R"));
        }

        return ans;
    }

}
