package DSA.BinarySearch;

public class RotatedArrWithDup {
    public static void main(String[] args) {
        int[] arr ={4,5,5,7,8,1,2};
        int target=8;
        System.out.println(search(arr,target));
    }

    static int search(int[] nums, int target){
        int pivot = findPivot(nums);

        //if v didn't find the pivot,it means the array is not rotated
        if(pivot==-1){
            //just do normal binary search
            System.out.println(bs(nums,target,0,nums.length-1));
        }else{
            if(nums[pivot]==target){
                return pivot;
            }
            if(target>nums[0]){
                return bs(nums,target,0,pivot-1);
            }
            return bs(nums,target,pivot+1,nums.length-1);
        }
        return -1;
    }

    static int bs(int[] arr,int target,int start, int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start =0;
        int end =arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            //4cases
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip duplicates
                //but whatif these at start and end were the pivot?
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                //check if end is  pivot;
                if(arr[end]<arr[end-1]){
                    return end -1;
                }
                end--;
            }
            // left side is sorted, pivot should be in right then
            else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
                start = mid +1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }

}
