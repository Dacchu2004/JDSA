package DSA.MathsForDSA;

public class FindUnique {
    public static void main(String[] args) {
        int [] arr={2,3,4,3,4,2,6};
        System.out.println(ans(arr));
    }

   static int ans(int[] arr) {
        int unique =0 ;
        for(int n: arr){
            unique^=n;
        }
        return unique;
    }

}
