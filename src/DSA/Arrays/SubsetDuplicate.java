package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsetDup(arr);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> subsetDup(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i =0; i<arr.length;i++){
            start = 0;
            //if current and previous ele is same , s=e+1
            if(i>0 && arr[i]==arr[i-1]){
                start = end +1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for(int j = start; j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j)); //a copy of the i-th existing subset of outer subset
                internal.add(arr[i]); //appends the arr[i] to the copied set/list
                outer.add(internal);// adds the internal list to the org list
            }
        }
        return outer;
    }
}
