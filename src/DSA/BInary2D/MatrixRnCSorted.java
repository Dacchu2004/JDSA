package DSA.BInary2D;

import java.util.Arrays;

public class MatrixRnCSorted {
    public static void main(String[] args) {
        int[] [] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr,28)));
    }

    static int[] search(int[][] matrix,int target){
        int row=0;
        int col= matrix.length-1; // for number of cols use matrix[0] for m*n matrix

        while(row< matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){ //if element is lesser than the target, vk that target may be present in next rows so row++
                row++;
            }else{ // if element is greater than the target it mean that target is not present in this col so col--
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
