package DSA.BinarySearch;

public class CountOfRotation {
    public static void main(String[] args) {

        int[] arr ={0,9,2,2,2};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] arr){
        int start=0;
        int end=arr.length-1;
        int count=0;
        int pivot =findPivot(arr,0,arr.length-1);

        count=start+pivot+1;
        return count;
    }

    static int findPivot(int[] arr,int start,int end){
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
