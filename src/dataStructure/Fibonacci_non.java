package dataStructure;

public class Fibonacci_non {
    public static void main(String[] args) {
        f(10);
    }

    public static void f(int x){
        int f1 = 1;
        int f2 = 1;
        int sum = 0;
        for(int i=2; i<=x; i++){
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            System.out.print(sum+" ");
        }

    }
}
