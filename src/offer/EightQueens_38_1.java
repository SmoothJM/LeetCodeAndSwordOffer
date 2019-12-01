package offer;

import java.util.ArrayList;
import java.util.Arrays;

public class EightQueens_38_1 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7};
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> li = allSeq(arr,0,list);

        System.out.println(queens(list).get(2000));
    }

    public static ArrayList<String> allSeq(int[] nums, int begin,ArrayList<String> list){
        if(begin==nums.length-1){
            String s ="";
            for (int i:nums) {
                s+=i;
            }
            if (!list.contains(s)) {
                list.add(s);
                return list;
            }
        }
        for (int i = begin; i < nums.length; i++) {
            swap(nums,i,begin);
            allSeq(nums,begin+1,list);
            swap(nums,i,begin);
        }
        return list;
    }

    public static ArrayList<String> queens(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<>();
        for (int k=0;k<list.size();k++) {
            String[] nums = list.get(k).split("");
            int[] num = new int[nums.length];
            for (int i=0;i<nums.length;i++) {
                num[i] = Integer.parseInt(nums[i]);
            }
            for (int i = 0; i < num.length-1; i++) {
                for (int j = i+1; j < num.length; j++) {
                    if(Math.abs(i-j)==Math.abs(num[i]-num[j])){
                        break;
                    }
                    if(j==num.length-1 && i==num.length-2){
                        result.add(list.get(k));
                    }
                }
            }
        }
        return result;
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
