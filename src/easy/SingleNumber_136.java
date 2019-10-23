package easy;

import java.util.*;

public class SingleNumber_136 {
    public static void main(String[] args) {
        int[] n1 = {2,2,1};
        int[] n2 = {4,1,2,1,2};
        System.out.println(singleNumber3(n1));
        System.out.println(singleNumber3(n2));
    }

    /**
     * map operation
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
        return 0;
    }

    /**
     * list operation
     * @param nums
     * @return
     */
    public static int singleNumber2(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }else{
                list.remove(list.indexOf(nums[i]));
            }
        }
        return list.get(0);
    }

    /**
     * math operation
     * 2∗(a+b+c)−(a+a+b+b+c)=c
     * 由于java没有sum函数，实现起来很麻烦，就不写了
     */
//    public static int singleNumber3 (int[] nums){
//        Set<Integer> set = new HashSet(Arrays.asList(nums));
//        return 2(Math.)
//    }

    /**
     * result of same number XOR is zero;
     * result of zero and number XOR is still number;
     * a^a = 0
     * a^0 = a
     * so: a^c^b^a^b = a^a^b^b^c = c 
     * @param nums
     * @return
     */
    public static int singleNumber3(int[] nums){
        int result=0;
        for (int n: nums) {
            result = result ^ n;
        }
        return result;
    }
    
}
