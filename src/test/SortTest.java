package test;

import java.util.Arrays;

public class SortTest {


    public static void main(String[] args) {
        int[] arr = new int[]{1515, 161, 503, 168, 20, 2442, 15, 14168, 4, 3232, 6, 543, 1456};
//        System.out.println(Arrays.toString(insertSort(arr)));
//        System.out.println(Arrays.toString(selectSort(arr)));
//        System.out.println(Arrays.toString(bubbleSort(arr)));
//        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
//        System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println(Arrays.toString(radixSort(arr)));
    }

    public static int[] insertSort(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        int temp = 0;
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            int j = i - 1;
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
        int min = 0;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        return a;
    }

    public static int[] bubbleSort(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
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
        int left = low;
        int right = high;
        int curr = a[low];
        while (left < right) {
            while (left < right && a[right] >= curr) {
                right--;
            }
            a[left] = a[right];
            a[right] = curr;
            while (left < right && a[left] <= curr) {
                left++;
            }
            a[right] = a[left];
            a[left] = curr;
        }
//        a[left] = curr;
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
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }

    public static int[] radixSort(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        int max = a[1], maxBit = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        while (max / 10 != 0) {
            maxBit++;
            max/=10;
        }
        int bucket[][] = new int[10][a.length];
        int base = 1;
        for (int i = 0; i < maxBit; i++) {
            int[] bl = new int[10];
            for (int j = 0; j < a.length; j++) {
                int whichBucket = (a[j] / base) % 10;
                bucket[whichBucket][bl[whichBucket]++] = a[j];
            }
            base *= 10;
            int m = 0;
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < bl[j]; k++) {
                    a[m++] = bucket[j][k];
                }
            }
        }


        return a;
    }

}
