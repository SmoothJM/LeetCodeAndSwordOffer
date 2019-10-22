package easy;

public class BestTimeToBuyAndSellStock_II_122 {
    public static void main(String[] args) {
        int[] a0 = new int[]{7, 1, 5, 3, 6, 4};
        int[] a1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] a2 = new int[]{7, 6, 4, 3, 1};
        int[] a3 = new int[]{1, 1, 1, 1, 1};
        System.out.println(maxProfit2(a0));
    }

    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int profit = 0;
        int valley = prices[0];
        int peak = prices[0];

        for (int i = 0; i < prices.length;i++ ) {
            while(i<prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
            valley = prices[i];
            while(i<prices.length-1 && prices[i]<=prices[i+1]){
                i++;
            }
            peak = prices[i];
            profit += peak - valley;
        }
        return profit;
    }

    public static int maxProfit2(int[] p){
        int profit = 0;
        for (int i = 1; i < p.length; i++) {
            if(p[i]>p[i-1]){
                profit += p[i] - p[i-1];
            }
        }
        return profit;
    }
}
