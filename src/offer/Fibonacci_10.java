package offer;

public class Fibonacci_10 {
    public static void main(String[] args) {
//        System.out.println(f(10));
        for (int i = 1; i <= 50; i++) {
            System.out.println(i+":"+f(i)+" ");
        }
//        f(100);
    }

    public static int f(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return f(n-1)+f(n-2);
    }

    public static int f2(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int first=1,second=1,sum=1;
        for (int i = 2; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
