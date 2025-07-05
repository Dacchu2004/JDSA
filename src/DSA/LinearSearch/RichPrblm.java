package DSA.LinearSearch;

public class RichPrblm {
    public static void main(String[] args) {
        int[][] arr ={
                {1,5},{7,3},{3,5}
        };
        System.out.println(maxWea(arr));
    }

    static int maxWealth(int[][] arr){
//        per=row
//        acc=col
        int res = Integer.MIN_VALUE;
        for (int per = 0; per < arr.length; per++) {
            int sum =0;
            for (int acc = 0; acc < arr[per].length; acc++) {
                sum += arr[per][acc];//sum = sum+arr[per][acc];
            }

            if(sum>res){
                res=sum;
            }
        }
        return res;
    }
//enhanced for
    static int maxWea(int [][] arr){
        int res = Integer.MIN_VALUE;
        for(int[] per : arr){
            int sum =0;
            for(int acc : per){
                sum+=acc;
            }
            if(sum>res){
                res=sum;
            }
        }
        return res;
    }
}
