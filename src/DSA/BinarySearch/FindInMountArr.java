package DSA.BinarySearch;

public class FindInMountArr {
    public static void main(String[] args) {
        int[] arr ={0,1,2,3,5,8,6,3,1};
        int target =6;
        int peak = peak(arr,target);
        int firstPart= oabs(arr,target,0,peak);
        if(firstPart!=-1){
            System.out.println(firstPart);
        }else{
            System.out.println(oabs(arr,target,peak+1,arr.length-1));
        }

    }

    static int peak(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){//means we are in the decreasing/descending part
                end = mid;
            }else{//means we are in ascending part
                start=mid+1;
            }
        }
        return start;
    }

    static int oabs(int[] arr, int target,int start,int end) {

//check whether the sorted array is ascending or descending
        boolean isAsc = arr[start]<arr[end];

        while (start <=end) {
            int mid = start + (end - start) / 2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
