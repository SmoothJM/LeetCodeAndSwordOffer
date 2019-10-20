package easy;

public class MaximumSubarray_53 {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] arr = new int[]{-2};
//        int[] arr = new int[]{-1, 0, -5};
        System.out.println(maxSubArray2(arr));

    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            int temp = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//                max = max > nums[j] ? max : nums[j];
//                temp += nums[j];
//                max = max > temp ? max : temp;
//            }
//        }

        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                max = max > nums[j] ? max : nums[j];
                temp += nums[j];
                max = max > temp ? max : temp;
            }
        }
        return max;
    }

    public static int maxSubArray2(int[] nums) {
        int thissum = 0;
        int maxsum = nums[0];
        for (int num : nums) {
            thissum += num;
            if (thissum > maxsum) {
                maxsum = thissum;
            }
            if (thissum < 0) {
                thissum = 0;
            }
        }
        return maxsum;

    }
}
