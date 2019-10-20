package easy;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        merge2(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.out.println(Arrays.toString(nums2));
        } else if (n == 0) {
            System.out.println(Arrays.toString(nums1));
        }
        int temp = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            j = m + i - 1;
            temp = nums2[i];
            while (j >= 0 && nums1[j] > temp) {
                nums1[j+1] = nums1[j];
                j--;
            }
            nums1[j+1] = temp;
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge2(int[]nums1, int n,int[]nums2, int m){
        int index1 = n-1;
        int index2 = m-1;
        for (int i = m+n-1; i >=0 ; i--) {
            if (index2<0){
                break;
            }else if (index1<0){
                nums1[i] = nums2[index2--];
            }else if (nums1[index1]>nums2[index2]){
                nums1[i] = nums1[index1--];
            }else {
                nums1[i] = nums2[index2--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
