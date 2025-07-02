package DSA.BinarySearch;

//finding the smallest num in the arr i.e, greater than or equal to target
public class CeilingPrblm {
    public static void main(String[] args) {
        int[] nums={1,3,5,9,14,16,18};
        int target = 15;
        System.out.println(bs(nums,target));
    }

    static int bs(int[] arr,int target){
        int start= 0;
        int end= arr.length-1;

        if(target>arr[arr.length-1]){
            return -1;
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(target<arr[mid]){
                end= mid-1;
            } else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
