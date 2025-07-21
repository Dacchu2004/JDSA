package DSA.Arrays;

public class Triplet {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // finding smallest
            } else if (num <= second) {
                second = num; // finding the element that is greater than first
            } else {
                return true; // if element is grater than both first and second then there exists a triple of indices
            }
        }
        return false;
    }
}
