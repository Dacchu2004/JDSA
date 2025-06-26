package DSA.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18, 12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr ={1399,128,65,63,59,23,15,11,9,6,3,1};

        int target = 65;

        System.out.println(bs(arr,target));
    }

    static int bs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

//check whether the sorted array is ascending or descending
        boolean isAsc = arr[start]<arr[end];

        while (start <= end) {
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