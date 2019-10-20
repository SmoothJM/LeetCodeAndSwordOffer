package easy;

public class FibonaccoNumber_509 {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int N) {
        int result = 0;
        if(N==1 || N==2){
            return 1;
        }
        int n1 = 1;
        int n2 = 1;
        for (int i = 3; i <= N; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }
}
