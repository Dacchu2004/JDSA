package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,2,6,3,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //1st get the max num in array
            int last=arr.length-i-1;
            int arrMaxIndex=maxIndex(arr,0,last);

            //swapping
            swap(arr,arrMaxIndex,last);
        }
    }
//finding max
    static int maxIndex(int[] arr,int start,int end){
        int max=start;
        for (int j = start; j <=end; j++) {
            if(arr[max]<arr[j]){
                max=j;
            }
        }
        return max;
    }
//swapping the ele
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
