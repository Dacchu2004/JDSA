package DSA.SortingRecursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,6,9,3};
        select(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr, int r , int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[max]){
               select(arr,r,c+1,c);
            }else{
                select(arr,r,c+1,max);
            }

        }else{ //after finding max element in the row we will proceed with swapping
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            select(arr,r-1,0,0);
        }
    }
}
