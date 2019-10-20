package easy;

import java.util.*;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        //int result[] = twoSum(nums, target);
        int result[] = twoSumSingleFor(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {//两个for循环
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
    public static int[] twoSumSingleFor(int[] nums, int target) {//两个for循环
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(map.containsKey(target-num)){
                return new int[]{map.get(target-num),i};
            }else{
                map.put(num,i);
            }
        }
        return null;
    }
}
