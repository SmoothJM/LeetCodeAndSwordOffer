package easy;

import java.util.Arrays;

public class MissingNumber_268 {
	public static void main(String[] args) {

	}

	public static int missingNumber(int[] nums) {
		if(nums==null || nums.length==0) return -1;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i) return i;
		}
		
		return 0;
	}

}
