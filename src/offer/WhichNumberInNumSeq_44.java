package offer;

public class WhichNumberInNumSeq_44 {
    public static void main(String[] args) {
        System.out.println(solution(1001));
    }

    public static int solution(int index){
        if(index<0) return -1;

        int digits = 1;
        while(true){
            int count = numberOfDigits(digits);
            if(index<count){
                int start = numberOfDigits(digits);
                int num = start + index/digits;
                int whichBitFromRight = digits - index%digits;
                for (int i = 1; i < whichBitFromRight; i++) {
                    num /= 10;
                }
                return num%10;
            }else{
                index -= count*digits;
                digits++;
            }
        }
    }

    public static int numberOfDigits(int n){
        if(n==1) return 10;
        else return 9*(int)Math.pow(10,n-1);
    }
    public static int startNum(int n){
        if(n==1) return 0;
        else return (int)Math.pow(10,n-1);
    }
}
