package Lecture13_Recursion;

import java.util.ArrayList;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] maze = {{true, true, true},
                            {true, true, true},
                            {true, true, true}};

        printPath(0,0,maze, "");

        System.out.println(returnPath(0, 0, maze, ""));

        System.out.println(countPath(0,0,maze));


    }

    private static int countPath(int r, int c, boolean[][] maze) {
        if(r == maze.length - 1 || c == maze[0].length - 1){
            return 1;
        }

        if(r < 0 || c < 0){
            return 1;
        }

        if(!maze[r][c]){
            return 0;
        }

        maze[r][c] = false;

        // Let's go down
        int down = countPath(r+1, c, maze);

        // Let's go right
        int right = countPath(r, c+1, maze);

        // Let's go up
        int up = countPath(r-1, c, maze);

        // Let's go left
        int left = countPath(r, c-1, maze);

        maze[r][c] = true;

        return down+right+up+left;
    }

    static void printPath(int r, int c, boolean[][] maze, String p){
        // Base Case

        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        // Check Post for visited path or not
        if(!maze[r][c]){
            return;
        }

        // If not visited currently we are moving from that path so let's mark it as false which tells us that we have already visited this path for this particular recursion call
        maze[r][c] = false;

        // Let's move down
        if(r < maze.length - 1){
            printPath(r+1, c, maze, p+"D");
        }

        // Let's move right
        if(c < maze[0].length - 1){
            printPath(r, c+1, maze, p+"R");
        }

        // Let's move up
        if(r > 0){
            printPath(r-1, c, maze, p+"U");
        }

        // Let's move left
        if(c > 0){
            printPath(r, c-1, maze, p+"L");
        }

        // When we are done with that particular recursion call while going back we will mark that position as true which will not cause any problem for other future recursion calls
        maze[r][c] = true;
    }

    static ArrayList<String> returnPath(int r, int c, boolean[][] maze, String p){
        // Base Case

        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // Check Post for visited path or not
        if(!maze[r][c]){
            return new ArrayList<>();
        }

        ArrayList<String> ans = new ArrayList<>();

        // If not visited currently we are moving from that path so let's mark it as false which tells us that we have already visited this path for this particular recursion call
        maze[r][c] = false;

        // Let's move down
        if(r < maze.length - 1){
            ans.addAll(returnPath(r+1, c, maze, p+"D"));
        }

        // Let's move right
        if(c < maze[0].length - 1){
            ans.addAll(returnPath(r, c+1, maze, p+"R"));
        }

        // Let's move up
        if(r > 0){
            ans.addAll(returnPath(r-1, c, maze, p+"U"));
        }

        // Let's move left
        if(c > 0){
            ans.addAll(returnPath(r, c-1, maze, p+"L"));
        }

        // When we are done with that particular recursion call while going back we will mark that position as true which will not cause any problem for other future recursion calls
        maze[r][c] = true;

        return ans;
    }

}
