package test;

import java.util.ArrayList;
import java.util.Arrays;

public class AllSort {
    public static void main(String[] args) {
        int[] nums = new int[]{133, 10, 503, 168, 20, 2442, 15, 14168, 4, 3232};
//        System.out.println(Arrays.toString(insertSort(nums)));
//        System.out.println(Arrays.toString(selectSort(nums)));
//        System.out.println(Arrays.toString(bubbleSort(nums)));
//        System.out.println(Arrays.toString(quickSort(nums, 0, nums.length - 1)));
//        System.out.println(Arrays.toString(mergeSort(nums)));
//        System.out.println(Arrays.toString(radixSort(nums)));
        System.out.println(Arrays.toString(heapSort(nums)));
    }

    public static void swap(int[] nums, int i, int j) {
        if (i == j) return;
        nums[j] = nums[j] + nums[i];
        nums[i] = nums[j] - nums[i];
        nums[j] = nums[j] - nums[i];
    }

    public static int[] insertSort(int[] nums) {
        if (nums == null || nums.length <= 0) return nums;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];
            j = i - 1;
            while (j >= 0 && nums[j] >= curr) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = curr;
        }
        return nums;
    }

    public static int[] selectSort(int[] nums) {
        if (nums == null || nums.length == 0) return nums;
        int minIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                nums[minIndex] = nums[minIndex] + nums[i];
                nums[i] = nums[minIndex] - nums[i];
                nums[minIndex] = nums[minIndex] - nums[i];
            }
        }

        return nums;

    }

    public static int[] bubbleSort(int[] nums) {
        if (nums == null || nums.length <= 0) return nums;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }

        return nums;
    }

    public static int[] quickSort(int[] nums, int low, int high) {
        if (nums == null || nums.length <= 0 || low < 0 || high > nums.length || low >= high) return nums;
        int left = low;
        int right = high;
        int curr = nums[low];
        while (left < right) {
            while (left < right && nums[right] > curr) {
                right--;
            }
            swap(nums, left, right);
            while (left < right && nums[left] < curr) {
                left++;
            }
            swap(nums, left, right);
        }

        quickSort(nums, low, left - 1);
        quickSort(nums, left + 1, high);
        return nums;
    }

    public static int[] mergeSort(int[] nums) {
        if (nums == null || nums.length <= 1) return nums;
        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] n1, int[] n2) {
        if ((n1 == null || n2 == null) || n1.length <= 0 && n2.length <= 0) return null;
        int i = 0, j = 0, k = 0;
        int[] result = new int[n1.length + n2.length];
        while (i < n1.length && j < n2.length) {
            if (n1[i] > n2[j]) {
                result[k++] = n2[j++];
            } else {
                result[k++] = n1[i++];
            }
        }
        while (i < n1.length) {
            result[k++] = n1[i++];
        }
        while (j < n2.length) {
            result[k++] = n2[j++];
        }
        return result;
    }

    public static int[] radixSort(int[] nums) {
        if (nums == null || nums.length <= 0) return nums;
        int maxBit = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        while (max > 0) {
            maxBit++;
            max /= 10;
        }

        int base = 1;
        int[][] bucket = new int[10][nums.length];
        for (int b = 1; b <= maxBit; b++) {
            int[] bl = new int[10];
            for (int i = 0; i < nums.length; i++) {
                int which = nums[i] / base % 10;
                bucket[which][bl[which]++] = nums[i];
            }
            base *= 10;
            int k=0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < bl[i]; j++) {
                    nums[k++] = bucket[i][j];
                }
            }
        }
        return nums;
    }

    public static int[] heapSort(int[] nums){
        if(nums==null || nums.length<=0) return nums;
        for (int i = nums.length/2-1; i >= 0; i--) {
            adjustHeap(nums,i,nums.length);
        }
        for (int i = nums.length-1; i >0; i--) {
            swap(nums,0,i);
            adjustHeap(nums,0,i);
        }
        return nums;
    }

    public static void adjustHeap(int[] nums,int parIndex,int length){
        int par = nums[parIndex];
        for (int i = 2*parIndex+1; i < length; i = 2*i+1) {
            //TODO change i+1 without ()
            if((i+1)<length && nums[i]<nums[i+1]){
                i++;
            }
            if(par<nums[i]){
                swap(nums,parIndex,i);
                parIndex=i;
            }else{
                break;
            }
        }

    }

//    public static int[]
}
