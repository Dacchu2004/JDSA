package DSA.Maze_Prblms;

public class Obstacles {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        obsPath("",board,0,0);
    }
    static void obsPath(String p,boolean[][] maze,int r,int c){ // arr.length - 1 → last row index , arr[0].length - 1 → last column index
        if(r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            obsPath(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            obsPath(p+'R',maze,r,c+1);
        }
    }
}
