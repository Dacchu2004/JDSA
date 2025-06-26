package DSA.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {2,-345,74,83,29,5,19,26,487,546};
        int target = 2;
        System.out.println(search(nums,target,3,7));
    }

    static int search(int[] arr,int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
