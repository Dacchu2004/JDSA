package DSA.BinarySearch;
///finding the position of the element in a sorted array of infinite numbers

//here in this we will be starting from the end and keep on doubling the size till we find the target
//1st the size of the array will be 2
//then the size is doubled that is 4 and move to right as well that is the 1st two element is left bcoz its already checked for the target
//then the size increases to 8,the 1st 6(2+4) elements left and moved to next that will be start=end+1
//we keep doubling until the target<end

public class PositionOfElement {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 4, 15, 16, 18, 22, 45, 89,100,120,130,140,156,178,256,278,300};
        int target = 140;//when the target goes beyond the 13th index then it may cause error here bcoz we are using an finite array if  we provide the infinite array then it works perffectly
        System.out.println(findRange(arr,target));
    }

    static int findRange(int[] arr,int target){
        //first find the range
        //first start with the box size 2
        int start =0;
        int end = 1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int temp = end+1;// this is new start
            //double the box value
            //end=end+previous end+size of box*2
            end=end+(end-start+1)*2;
            start=temp;
        }
        return bs(arr,target,start,end);
    }

    static int bs(int[] arr,int target,int start,int end){
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
}


