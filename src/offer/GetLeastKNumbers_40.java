package offer;

import java.util.ArrayList;
import java.util.Arrays;

public class GetLeastKNumbers_40 {
    public static void main(String[] args) {
        int[] nums = {5,4,3,4,6,3,2,3};
        System.out.println(Arrays.toString(solution2(nums,4).toArray()));
    }

    /**
     * sort
     * @param input
     * @param k
     * @return
     */
    public static ArrayList<Integer> solution1(int [] input, int k) {
        if(input==null || input.length==0 || k<0 || k>input.length) return new ArrayList<>();
        Arrays.sort(input);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static ArrayList<Integer> solution2(int[] input,int k){
        if(input==null || input.length==0 || k<0 || k>input.length) return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int index = partition(input,0,input.length-1);
        int start = 0;
        int end = input.length-1;
        while(index!=(k-1)){
            if(index<(k-1)){
                start = index+1;
                index = partition(input,start,end);
            }else{
                end = index-1;
                index = partition(input,start,end);
            }
        }
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    public static int partition(int[] nums,int start,int end){
        if(start==end) return start;
        if(start>end || start<0 || end>nums.length) return -1;
        int curr = nums[start];

        while(start<end){
            while(start<end && curr<=nums[end]){
                end--;
            }
            swap(nums,start,end);
            while (start<end && curr>=nums[start]){
                start++;
            }
            swap(nums,start,end);
        }
        return start;
    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}




















