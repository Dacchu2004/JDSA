package DSA.SortingRecursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,6,4,3,1,2};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString((arr)));
    }

    static void sort(int[] arr, int lo, int hi){
        if (lo >= hi){
            return;
        }

        int s = lo;
        int e = hi;
        int m = s+(e-s)/2;
        int pivot = arr[m];

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }

            //using this cond here coz s<=e this cod in while loop may not holds true after s++ and e-- so v check here and swap
            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }

        //after the above steps the pivot will be 2 crt position so now v should work/sort other parts/halves
        sort(arr,lo,e);
        sort(arr,s,hi);
    }
}
