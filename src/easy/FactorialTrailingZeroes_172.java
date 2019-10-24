package easy;

public class FactorialTrailingZeroes_172 {
    public static void main(String[] args) {
        int[] ns = {3,5,10};
        for (int i=0;i<ns.length;i++){
            System.out.println(trailingZeroes2(ns[i]));
        }
    }

    /**
     * 超出范围
     * @param n
     * @return
     */
    public static int trailingZeroes(int n) {
        String s = fac(n)+"";
        int count=0;
        for (int i = s.length()-1; i >0; i--) {
            if(s.charAt(i)!='0') {
                break;
            }
            count++;
        }
        return count;
    }

    public static long fac(int n){
        if(n==2) return n;
        return n*fac(n-1);
    }



    public static int trailingZeroes2(int n) {
        int sum = 0;
        while(n!=0){
            sum += n/5;
            n /= 5;
        }
        return sum;
    }


}
