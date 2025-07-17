package DSA.Sorting;
//645 this is also same as missing number but here we find the missing num and also return the dup ele that is present in the index of missing number
class SetMismatch {
    public int[] mismatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                return new int[] {arr[index],index+1};
            }
        }
        return new int[] {-1,-1};
    }
    void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
