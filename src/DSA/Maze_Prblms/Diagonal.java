package DSA.Maze_Prblms;

import java.util.ArrayList;

public class Diagonal {
    public static void main(String[] args) {
        System.out.println(diagonalPathRet("",3,3));
    }
    //using arraylist
    static ArrayList<String> diagonalPathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(diagonalPathRet(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll(diagonalPathRet(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(diagonalPathRet(p+'H',r,c-1));
        }
        return list;
    }
}
