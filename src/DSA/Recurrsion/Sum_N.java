package DSA.Recurrsion;

public class Sum_N {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n + sum(n-1);
    }
}
