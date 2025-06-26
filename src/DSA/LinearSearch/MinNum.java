package DSA.LinearSearch;

public class MinNum {
    public static void main(String[] args) {
        int[] nums = {2,-345,74,83,29,5,19,-26,487,546};
        System.out.println(min(nums));
    }

    static int min(int[]arr){
        int min = arr[0];
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
