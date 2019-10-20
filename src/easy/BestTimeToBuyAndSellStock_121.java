package easy;

public class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {
        int[] a = new int[]{7, 1, 5, 3, 6, 4};
        int[] a2 = new int[]{7, 6, 4, 3, 1};
        int[] a3 = new int[]{1, 1, 1, 1, 1};
        System.out.println(maxProfit3(a));
//        System.out.println(maxProfit3(a3));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int temp = 0;
        int max = -1;
        for (int i = 0; i < prices.length; i++) {
            temp = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (max < prices[j] - temp) {
                    max = prices[j] - temp;
                }
            }
            if (profit < max) {
                profit = max;
            }
        }
        return profit;
    }

    public static int maxProfit2(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }

    public static int maxProfit3(int[] prices) {
        int ans = 0;
        int len = prices.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (prices[j] > prices[i]) {
                    ans = Math.max(ans, prices[j] - prices[i]);
                } else {
                    i = j;
                }
            }
        }

        return ans;
    }
}
