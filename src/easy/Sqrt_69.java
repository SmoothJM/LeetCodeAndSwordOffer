package easy;

public class Sqrt_69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));//2147395599
    }

    public static int mySqrt(int x) {
        if(x==1) return 1;
        if(x==0) return 0;
        long high = x/2;
        long low = 1;

        while(low<high){
            long middle = (low+high)/2+1;
            long mm = middle*middle;

            if(mm==x){
                return (int)middle;
            }else if(mm<x){
                low = middle + 1;
            }else{
                high = middle - 1;
            }
        }
        if(high*high<=x){
            return (int)high;
        }else{
            return (int)high-1;
        }

    }
}
