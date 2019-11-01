package easy;

public class SumOfTwoIntegers_371 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2));
        System.out.println(getSum(0, 0));
        System.out.println(getSum(45, 99));
        System.out.println(getSum(199, 3));
        System.out.println(getSum(-51, 51));
        System.out.println(getSum(-11, 28));
        System.out.println(getSum(-11, 5));
        System.out.println(getSum(-11, -19));
    }

    /**
     * a^b = a和b的无进位加法结果；
     * (a&b)<<1 = a和b的进位位置；
     * 把他们都加起来，直到进位为0；
     * @param a
     * @param b
     * @return
     */
    public static int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
