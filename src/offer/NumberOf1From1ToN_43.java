package offer;

public class NumberOf1From1ToN_43 {
    public static void main(String[] args) {
        System.out.println(solution1(1));
        System.out.println(solution2(1));
    }

    /**
     * 暴力法，取余判断当前数的个位是否为1
     *
     * @param n
     * @return
     */
    public static int solution1(int n) {
        if (n < 1) return 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int temp = i;
            while (temp != 0) {
                int unit = temp % 10;
                if (unit == 1) count++;
                temp /= 10;
            }
        }
        return count;
    }

    /**
     * 按位算，当当前位是0，1，大于1的数用不同的公式去算
     *
     * @param n
     * @return
     */
    public static int solution2(int n) {
        if (n < 1) return 0;
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int high = n / (i * 10);
            int curr = n / i % 10;
            int low = n % i;
            if (curr == 0) {
                count += high * i;
            } else if (curr == 1) {
                count += high * i + low + 1;
            } else {
                count += (high + 1) * i;
            }
        }

        return count;
    }
}
