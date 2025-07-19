package DSA.Sorting;

// 41 hard asked in amazon use cyclic sort
//we have to find the smallest positive missing element
//so we should ignore the negatives
//start checking from 1

class FirstMissingNum {
    public int firstMiss(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i]>0 && arr[i]<= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                return index+1;
            }
        }
        return arr.length+1;
    }
    void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
