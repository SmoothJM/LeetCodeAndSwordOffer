package easy;

public class PowerOfThree_326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(1));
        System.out.println(isPowerOfThree(3));
        System.out.println(isPowerOfThree(29));

    }

    public static boolean isPowerOfThree(int n) {
        if(n<=0 || n==2) return false;
        int max = (int)Math.pow(3,19);
        return max%n==0;
    }
}
