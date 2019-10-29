package easy;

public class CountPrimes_204 {
    public static void main(String[] args) {
        System.out.println(countPrimes(15));
    }

    /**
     * 2 to n-1
     *
     * @param n
     * @return
     */
    public static boolean isPrimes(int n){
        if(n==2) return true;
        for (int i = n-1; i > 1; i--) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    /**
     * 2 to square(n)
     *
     * @param n
     * @return
     */
    public static boolean isPrimes2(int n){
        if(n==2) return true;
        int sq = (int) Math.sqrt(n);
        for (int i = sq; i > 1; i--) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    /**
     * 2 to square(n) only odd number except 2
     *
     * @param n
     * @return
     */
    public static boolean isPrimes3(int n){
        if(n==2) return true;
        int sq = (int) Math.sqrt(n);
        if(n%2==0) return false;
        for (int i = 3; i <= sq ; i+=2) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int n) {
        if (n <= 2) return 0;
        int count = 1;
        n=n-1;
        while (n > 2) {
            if(isPrimes(n)){
                count++;
            }
            n--;
        }
        return count;
    }



}
