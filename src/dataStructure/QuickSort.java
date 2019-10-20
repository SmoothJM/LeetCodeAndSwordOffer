package dataStructure;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{6, 9, 2, 5, 8, 3, 7, 0};
        System.out.println(Arrays.toString(sort(array, 0, array.length - 1)));
    }

    public static int[] sort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {return arr;}
        if (low >= high) {return arr;}
        int left = low;
        int right = high;
        int curr = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= curr) {
                right--;
            }
            if(left==right){break;}
            arr[left] = arr[right];
            arr[right] = curr;
            System.out.println(Arrays.toString(arr));
            while (left < right && arr[left] <= curr) {
                left++;
            }
            arr[right] = arr[left];
            arr[left]=curr;
            System.out.println(Arrays.toString(arr));
        }
        arr[right] = curr;
        sort(arr,right+1,high);
        sort(arr,low,right-1);
        return arr;
    }

}
