package offer;

import java.util.HashMap;

public class GetNumberOfK_53 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 3, 3, 4, 5};
        System.out.println(solution2(nums, 6));
    }

    /**
     * 遍历一遍所有数字
     *
     * @param nums
     * @param k
     * @return
     */
    public static int solution1(int[] nums, int k) {
        if (nums == null || nums.length <= 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);
        }
        return map.containsKey(k) ? map.get(k) : 0;
    }

    /**
     * 修改二分查找1
     * 思路：找到当前值，然后从此值位置向两边查相同的数，知道两边都不是目标值
     * @param nums
     * @param k
     * @return
     */
    public static int solution2(int[] nums, int k) {
        if (nums == null || nums.length <= 0) return 0;
        int count = 0;
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (nums[mid] == k) {
                count++;
                break;
            }
            else if (nums[mid] < k) low = mid+1;
            else high = mid-1;
        }
        int i = mid-1, j = mid+1;
        while (i >= 0 || j < nums.length) {
            if(i>=0 && nums[i]==k){
                count++;
                low=i;
            }
            if(j<nums.length && nums[j]==k){
                count++;
                high=j;
            }
            i--;
            j++;
        }

        return count;
    }
}
