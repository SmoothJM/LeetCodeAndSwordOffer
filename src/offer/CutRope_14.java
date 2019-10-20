package offer;

public class CutRope_14 {
    public static void main(String[] args) {
        System.out.println(cut2(10));
    }

    public static int cut(int n) {
        if (n <= 3) return n;
        int left = n/2;
        int right = n - left;
        return cut(left) * cut(right);
    }

    public static int cut2(int n) {
        if (n <= 1) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;
        int timeOf3 = n/3;
        if(n - 3*timeOf3==1){
            timeOf3 -= 1;
        }
        int timeOf2 = (n - 3*timeOf3)/2;
        return (int)Math.pow(3,timeOf3) * (int)Math.pow(2,timeOf2);
    }
}
