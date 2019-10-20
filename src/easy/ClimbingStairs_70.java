package easy;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {
        int result = 0;
        if(n==1){
            return 1;
        }
        int c1 = 1;
        int c2 = 1;
        for (int i = 2; i <= n; i++) {
            result = c1 + c2;
            c1 = c2;
            c2 = result;
        }
        return result;
    }
}
