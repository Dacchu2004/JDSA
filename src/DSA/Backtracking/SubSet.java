package DSA.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        // Add the current subset to the result
        result.add(new ArrayList<>(current));

        // Explore further elements to include
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);                     // Choose
            backtrack(nums, i + 1, current, result);  // Explore
            current.remove(current.size() - 1);       // Un-choose (Backtrack)
        }
    }
}
