package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays_II_350 {
    public static void main(String[] args) {
        int[] n1 = {54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,
                27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,
                13,28,38,21,55,37,4,67,64,86,45,33,41};
        int[] n2 = {17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,
                34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,
                14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,
                76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,
                86,42,53,0,33,80,20};

        int[] n3 = {4, 4,5,5,4,4};
        int[] n4 = {9, 4, 9, 8, 4};

//        System.out.println(Arrays.toString(intersect(n1, n2)));
        System.out.println(Arrays.toString(intersect2(n3, n4)));
    }

    /**
     * 原题
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int[] output = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }
        return output;
    }

    /**
     * 如果两个数组排好序了
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]==nums2[j]) {
                list.add(nums1[i]);
                j++;
                i++;
            }else if(nums1[i]<nums2[j]) i++;
            else j++;
        }

        int[] output = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            output[k] = list.get(k);
        }
        return output;
    }
}
