package offer;

public class CoverTable_10_2 {
    public static void main(String[] args) {
        System.out.println(f2(8));
    }

    public static int f1(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return f1(n-1) + f1(n-2);
    }
    public static int f2(int n){
        int sum = 0,first=1,second=4;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        for (int i = 3; i <=n ; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
