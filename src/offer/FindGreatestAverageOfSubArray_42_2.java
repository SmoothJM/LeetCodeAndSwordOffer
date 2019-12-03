package offer;

/**
 * 此题和42题区别是，一个找子数组最大和，一个找子数组最大平均值；
 * 输入的数组也不同，上个有负数，此题只有正数；
 */
public class FindGreatestAverageOfSubArray_42_2 {
    public static void main(String[] args) {
        int[] n1 = {10, 2, 5, 3, 10, 10, 8, 9, 10};
        int[] n2 = {10, 2, 15, 3, 5, 10, 8, 0, 10};
        System.out.println(solution1(n1));
        System.out.println(solution1(n2));
        System.out.println("===");
        System.out.println(solution2(n1));
        System.out.println(solution2(n2));
    }

    public static int solution1(int[] nums) {
        if (nums == null || nums.length <= 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        int avg = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (avg < nums[i]) {
                avg = (avg * count++ + nums[i]) / count;
            } else {
                avg = nums[i];
                count=1;
            }
            if (max < avg) {
                max = avg;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]) max = nums[i];
        }

        return max;
    }

    public static int solution2(int[] nums) {
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
        return result/(end-start+1);
    }


}
