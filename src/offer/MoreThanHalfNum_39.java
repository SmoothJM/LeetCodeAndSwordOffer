package offer;

import java.util.*;

public class MoreThanHalfNum_39 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,2,2,5,4,2};
        System.out.println(solution3(nums));
    }

    /**
     * 如果数组中不一定存在超过一半次数的，此方法无法解决。
     * 而且修改了原数组
     * @param nums
     * @return
     */
    public static int solution1(int[] nums){
        if (nums==null || nums.length==0) return 0;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums[nums.length/2];
    }

    /**
     * 用map，时间复杂On，解决上述问题。
     *
     * @param nums
     * @return
     */
    public static int solution2(int[] nums){
        if (nums==null || nums.length==0) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int l = nums.length/2;
        int result=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if(entry.getValue()>l){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    public static int solution3(int[] nums){
        if (nums==null || nums.length==0) return 0;
        int curr = nums[0];
        int times=1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=curr){
                times--;
            }else{
                times++;
            }
            if(times==0){
                curr=nums[i];
                times=1;
            }
        }

        if(isMoreThanHalf(nums,curr)){
            return curr;
        }else{
            return 0;
        }
    }
    public static boolean isMoreThanHalf(int[] nums,int target){
        int times=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                times++;
            }
        }
        return times>nums.length/2;


    }

}

