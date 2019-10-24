package easy;

public class HouseRobber_198 {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 1 };
		int[] nums2 = { 2, 7, 9, 3, 1 };
		int[] nums3 = { 2, 1, 1, 2 };
		System.out.println(rob3(nums1));
		System.out.println(rob3(nums2));
		System.out.println(rob3(nums3));
	}

	public static int rob(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return nums[0] > nums[1] ? nums[0] : nums[1];
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0, j = 1; i < nums.length;i+=2,j+=2) {
			sum1+=nums[i];
			if(j<nums.length) {
				sum2+=nums[j];
			}
		}
		
		return sum1>sum2?sum1:sum2;
	}
	
	public static int rob2(int[] num) {
	    int prevMax = 0;
	    int currMax = 0;
	    for (int x : num) {
	        int temp = currMax;
	        currMax = Math.max(prevMax + x, currMax);
	        prevMax = temp;
	    }
	    return currMax;
	}

	public static int rob3(int[] num) {
	    int[] dp = new int[num.length+1];
	    dp[0] = 0;
	    dp[1] = num[0];
	    for (int i = 2; i <= num.length; i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+num[i-1]);
		}
	    return dp[num.length];
	}
}
