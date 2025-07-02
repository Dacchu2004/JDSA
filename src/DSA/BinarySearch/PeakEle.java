package DSA.BinarySearch;

public class PeakEle {
    public static void main(String[] args) {
        int [] arr ={0,1,2,3,7,9,5,3,1,0};
        System.out.println(index(arr));
    }

    static int index(int[] arr){
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
}
