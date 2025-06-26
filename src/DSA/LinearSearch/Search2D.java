package DSA.LinearSearch;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr ={
                {1,2,3},
                {4,5,6,7},
                {8,9},
                {10}
        };
        int target = 10;
//        int[] res = sea2(arr,target);
//        System.out.println(Arrays.toString(res));
        System.out.println(max(arr));
    }

    static int[] sea2(int[][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

//to calculate max num using enhanced for
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints:arr){
            for(int ele:ints){
                if (ele>max){
                    max=ele;
                }
            }
        }
        return max;
    }
}
