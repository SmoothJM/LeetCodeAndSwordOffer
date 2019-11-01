package easy;

import java.util.Arrays;

public class MissingNumber_268 {
	public static void main(String[] args) {
		int[] nums = {0,3,4,1};
		System.out.println(missingNumber2(nums));
	}

	public static int missingNumber(int[] nums) {
		if(nums==null || nums.length==0) return -1;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i) return i;
		}
		return 0;
	}

	/**
	 * bit calculation
	 * @param nums
	 * @return
	 */
	public static int missingNumber2(int[] nums) {
		if(nums==null || nums.length==0) return -1;
		int miss = nums.length;
		for (int i = 0; i < nums.length; i++) {
			miss = miss ^ i ^ nums[i];
		}
		return miss;
	}

}
