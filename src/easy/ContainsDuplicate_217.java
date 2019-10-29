package easy;

import java.util.*;

public class ContainsDuplicate_217 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = null;
        int[] a3 = {1};
        int[] a4 = {1,1};
        int[] a5 = {1,2,3,4,3,2,1,4,3,2,5,1,2};
        System.out.println(containsDuplicate3(a1));
        System.out.println(containsDuplicate3(a2));
        System.out.println(containsDuplicate3(a3));
        System.out.println(containsDuplicate3(a4));
        System.out.println(containsDuplicate3(a5));
    }

    /**
     * 超时
     * @param nums
     * @return
     */
    public static boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length<2) return false;

        List<Integer> list = new ArrayList<>();

        for (int i: nums) {
            if(list.contains(i)) return true;
            list.add(i);
        }
        return false;
    }

    /**
     * sort
     * @param nums
     * @return
     */
    public static boolean containsDuplicate2(int[] nums) {
        if(nums==null || nums.length<2) return false;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }

    /**
     * set
     * @param nums
     * @return
     */
    public static boolean containsDuplicate3(int[] nums) {
        if(nums==null || nums.length<2) return false;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return set.size()!=nums.length;
    }
}

