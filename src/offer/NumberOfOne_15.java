package offer;

public class NumberOfOne_15 {
    public static void main(String[] args) {
        System.out.println(count3(-3));
    }

    public static int count1(int n) {
        if (n == 0) return 0;
        int result = 0;
        if (n < 0) {
            n = -n;
            result++;
        }
        while (n != 0) {
            if ((n & 1) == 1) {
                result++;
            }
            n = n >>> 1;
        }
        return result;
    }
    /**
     * 减1后的值比原值相与，就是将二进制表示中最后一个1变成0
     */
    public static int count2(int n) {
        if (n == 0) return 0;
        int result = 0;
        if (n < 0) {
            n = -n;
            result++;
        }
        while (n != 0) {
            n = (n - 1) & n;
            result++;
        }
        return result;
    }
    /**
     * 左移版本
     */
    public static int count3(int n) {
        if (n == 0) return 0;
        int result = 0;
        if (n < 0) {
            n = -n;
            result++;
        }
        int flag = 1;
        while (flag != 0) {
            if (( flag&n ) != 0) {
                result++;
            }
            flag = flag << 1;
        }
        return result;
    }
}
