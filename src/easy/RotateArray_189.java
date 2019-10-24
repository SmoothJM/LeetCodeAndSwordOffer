package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray_189 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {-1, -100, 3, 99};
        int k = 2;
        rotate3(nums1, k);
    }

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1) return;
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

  

    /**
     * 旋转，时间：On， 空间：O1
     *
     * @param nums
     * @param k
     */
    public static void rotate3(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1) return;
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int[] nums,int low,int high){
        while (low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }

}
