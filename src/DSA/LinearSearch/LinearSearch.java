package DSA.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2,-345,74,83,29,5,19,26,487,546};
        int target=83;
        int res = linearSearch(nums,target);
        System.out.println("The "+target+" is present in Array at index "+ res);
    }

    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            System.out.println("It's an Empty Array");
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}