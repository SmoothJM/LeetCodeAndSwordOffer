package easy;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int n = 100;
        long time1 = System.currentTimeMillis();
        System.out.println(f1(n));
        long time2 = System.currentTimeMillis();
        System.out.println(f2(n));
        long time3 = System.currentTimeMillis();

        System.out.println(time2-time1);
        System.out.println(time3-time2);
    }

    public static long f1( int n ){
        long mul = 1;
        for (int i = 2; i <=n ; i++) {
            mul*=i;
        }
        return mul;
    }

    public static long f2( int m ){
        if(m==2) return m;
        return m*f2(m-1);
    }
}
