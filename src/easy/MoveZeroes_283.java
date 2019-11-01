package easy;

import java.util.Arrays;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        int[] b = {0,0,1};
        moveZeroes2(a);
    }

    public static void moveZeroes(int[] nums) {
        if(nums==null || nums.length<2) return;
        int count=0;
        for (int i = 0; i < nums.length-count; i++) {
            if(nums[i]==0){
                count++;
                for (int j = i; j < nums.length-1; j++) {
                    nums[j] = nums[j+1];
                }
                i--;
                nums[nums.length-1]=0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes2(int[] nums) {
        if(nums==null || nums.length<2) return;
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0) nums[j++] = nums[i];
        }
        while(j<nums.length){
            nums[j++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
