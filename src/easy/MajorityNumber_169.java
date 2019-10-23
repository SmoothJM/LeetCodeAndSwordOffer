package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityNumber_169 {
    public static void main(String[] args) {
        int[] a1 = {3};
        int[] a2 = {2,2,1,1,1,2,2};
//        System.out.println(majorityElement3(a1));
        System.out.println(majorityElement3(a2));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }


    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    /**
     * count=0的时候意思是前面出现的数字和当前出现的数字出现的次数一样了
     * @param nums
     * @return
     */
    public static int majorityElement3(int[] nums){
        int candi = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count==0){
                candi = nums[i];
                count=1;
            }else if(nums[i]==candi) {
                count++;
            }else{
                count--;
            }
        }
        return candi;
    }
}
