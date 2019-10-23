package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class TwoSum_II_SortedArray_167 {
	public static void main(String[] args) {
		int[] arr = {-1,2,7,11,15};
		System.out.println(Arrays.toString(twoSum2(arr,9)));
	}

	public static int[] twoSum(int[] numbers, int target) {
		if(numbers == null || numbers.length==0)return null;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if(map.containsKey(target-numbers[i])) {
				return new int[] {map.get(target-numbers[i]),i+1};
			}else {
				map.put(numbers[i], i+1);
			}
		}
		return null;
	}
	
	public static int[] twoSum2(int[] numbers,int target) {
		if(numbers == null || numbers.length==0)return null;
		int low=0;
		int high=numbers.length-1;
		while(low<high) {
			if(numbers[low]+numbers[high]==target) {
				return new int[]{low+1,high+1};
			}else if(numbers[low]+numbers[high]<target) {
				low++;
			}else {
				high--;
			}
		}
		
		
		return null;
	}
}
