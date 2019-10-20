package test;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[]{1515, 161, 503, 168, 20, 2442, 15, 14168, 4, 3232};
        System.out.println(Arrays.toString(insertSort(arr)));
//        System.out.println(Arrays.toString(selectSort(arr)));
//        System.out.println(Arrays.toString(bubbleSort(arr)));
//        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
//        System.out.println(Arrays.toString(mergeSort(arr)));
//        System.out.println(Arrays.toString(radixSort(arr)));

        System.out.println(binarySearch(insertSort(arr),1416));

    }


    public static int binarySearch(int[] a,int t){
        int index = -1;
        if(a==null || a.length<0) return -1;
        int low = 0;
        int high = a.length;
        while(low<high){
            int mid = (low + high)/2;
            if(t==a[mid]){
                index=mid;
                break;
            }else if(t<a[mid]){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }

        return index;
    }

    public static int[] insertSort(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        int j = 0;
        int temp = 0;
        for (int i = 1; i < a.length; i++) {
            j = i - 1;
            temp = a[i];
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }

        return a;
    }

    public static int[] selectSort(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        int minIndex = 0;
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                a[i] = a[i] + a[minIndex];
                a[minIndex] = a[i] - a[minIndex];
                a[i] = a[i] - a[minIndex];
            }
        }

        return a;
    }

    public static int[] bubbleSort(int[] a) {
        if (a == null || a.length == 0) return a;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }

    public static int[] quickSort(int[] a, int low, int high) {
        if (a == null || a.length == 0) {
            return a;
        }
        if (low >= high) {
            return a;
        }
        int left = low, right = high;
        int mid = a[low];
        while (left < right) {
            while (left < right && a[right] >= mid) {
                right--;
            }
            a[left] = a[right];
            a[right] = mid;

            while (left < right && a[left] <= mid) {
                left++;
            }
            a[right] = a[left];
            a[left] = mid;
        }
        quickSort(a, low, left - 1);
        quickSort(a, left + 1, high);
        return a;
    }

    public static int[] mergeSort(int[] a) {
        if (a == null || a.length <= 1) {
            return a;
        }
        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int l=0,r=0,k=0;
        while(l<left.length && r<right.length){
            if(left[l]<right[r]){
                result[k++] = left[l++];
            }else{
                result[k++] = right[r++];
            }
        }
        while(r<right.length){
            result[k++] = right[r++];
        }
        while(l<left.length){
            result[k++] = left[l++];
        }

        return result;
    }


    public static int[] radixSort(int[] a) {

        return a;
    }

}
