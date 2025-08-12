package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetIterative {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list: ans){
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)); //a copy of the i-th existing subset of outer subset
                internal.add(num); //appends the num to the copied set/list
                outer.add(internal);// adds the internal list to the org list
            }
        }
        return outer;
    }
}
