package offer;

import java.util.Arrays;

public class OddEleEvenEle_21 {
    public static void main(String[] args) {
        int[] num1 = {10, 2, 102, 4, 51, 71, 91};//1345678902
        int[] num2 = {1, 2, 3, 4, 5, 6};//1356789024
        System.out.println(Arrays.toString(sort2(num1)));
    }

    /**
     * go through from head
     *
     * @param nums
     * @return
     */
    public static int[] sort(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int count = 0;
        for (int i = 0; i < nums.length; ) {
            if (nums[i] % 2 == 0 && (count + i) <= nums.length - 1) {
                int temp = nums[i];
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                count++;
                nums[nums.length - 1] = temp;
                System.out.println(Arrays.toString(nums));
            } else i++;
        }
        return nums;
    }

    /**
     * go through from head and tail
     * double points
     *
     * @param nums
     * @return
     */
    public static int[] sort2(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            if (nums[low] % 2 == 0) {
                while (nums[high] % 2 == 0 && low < high) {
                    high--;
                }
                if(low!=high){
                    nums[low] = nums[low] + nums[high];
                    nums[high] = nums[low] - nums[high];
                    nums[low] = nums[low] - nums[high];
                }
            }
            low++;
        }
        return nums;
    }
}
