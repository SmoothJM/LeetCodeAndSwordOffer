package offer;

public class FindGreatestSumOfSubArray_42 {
    public static void main(String[] args) {
        int[] n1 = {6, -3, -2, 7, -15, 1, 2, 2};
        int[] n2 = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.println(solution2(n1));
        System.out.println(solution2(n2));
    }

    /**
     * 暴力法，不推荐
     *
     * @param nums
     * @return
     */
    public static int solution1(int[] nums) {
        if (nums == null || nums.length <= 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int temp = calc1(nums, i, j);
                if (max < temp) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public static int calc1(int[] nums, int start, int end) {
        if (start == end) return nums[start];
        int result = 0;
        for (int i = start; i <= end; i++) {
            result += nums[i];
        }
        return result;
    }

    /**
     * On时间解决
     * 思路：如果当前的和比当前的元素还小，说明当前和可抛弃。
     * 也就是说，加上第i位的和比第i位的值还小，说明前i-1位小于零，可抛弃
     * 从第i位开始算。
     * @param nums
     * @return
     */
    public static int solution2(int[] nums) {
        if (nums == null || nums.length <= 0) return Integer.MIN_VALUE;
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(sum<=0){
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }
            if(max<sum) {
                max = sum;
            }
        }
        return max;
    }
    public static int _solution2(int[] nums) {
        if (nums == null || nums.length <= 0) return Integer.MIN_VALUE;
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum<nums[i]){
                sum=nums[i];
            }
            if(max<sum) {
                max = sum;
            }
        }
        return max;
    }

    /**
     * 递归
     * @param nums
     * @return
     */
    public static int solution3(int[] nums){
        if (nums == null || nums.length <= 0) return Integer.MIN_VALUE;

        return 1;
    }

}
