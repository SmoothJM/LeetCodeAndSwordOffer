package dataStructure;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = new int[]{54,12,45,22,5,12,34,0};
        System.out.println(Arrays.toString(sort(array)));

        System.out.println(Arrays.toString(sort2(array)));
    }

    public static int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int temp = 0;
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            //待排序的元素；新拿出来的元素；
            temp = array[i];
            j = i - 1;
            //移位操作
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            //我要插入的地方就是j+1的位置(因为前面j--了)
            array[j + 1] = temp;
        }
        return array;
    }


    public static int[] sort2(int[] arr){
        if(arr==null || arr.length==0){
            return arr;
        }

        int temp = 0;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i-1;
            while(j>=0 && arr[j]<temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        return arr;
    }


}
