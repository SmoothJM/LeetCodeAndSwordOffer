package easy;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 9, 9};
        int[] a = plusOne(arr);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0;i--){
            digits[i]++;
            digits[i] = digits[i]%10;
            if(digits[i]!=0) {return digits;}
        }
        digits = new int[1+digits.length];
        digits[0]=1;
        return digits;
    }
}
