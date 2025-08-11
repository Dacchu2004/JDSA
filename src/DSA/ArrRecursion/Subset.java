package DSA.ArrRecursion;

import java.util.*;

public class Subset {

    public static List<List<Integer>> subsets(int[] nums) {
        return generateSubsets(new ArrayList<>(), nums, 0);
    }

    private static List<List<Integer>> generateSubsets(List<Integer> current, int[] nums, int index) {
        if (index == nums.length) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>(current)); // Add a copy
            return result;
        }

        // Choice 1: include nums[index]
        current.add(nums[index]);
        List<List<Integer>> left = generateSubsets(current, nums, index + 1);

        // Choice 2: exclude nums[index]
        current.remove(current.size() - 1);
        List<List<Integer>> right = generateSubsets(current, nums, index + 1);

        // Merge both lists
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = subsets(nums);
        System.out.println(result);
    }
}
