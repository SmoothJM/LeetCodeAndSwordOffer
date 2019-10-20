package dataStructure;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{4,3,3,2,7,1,0,8,9};
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort2(arr)));
    }

    /**
     * min中存储的是当前序列中最小的数字
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr){
        if(arr==null || arr.length==0){return arr;}
        int min=0;
        for(int i=0; i<arr.length-1;i++){
            min = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min = arr[j];
                }
                if(arr[i]!=min){
                    arr[i] = arr[i]+arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
            //System.out.println(min);
        }
        return arr;
    }

    /**
     * min中存储的是当前序列中最小的数字的索引
     * @param arr
     * @return
     */
    public static int[] sort2(int[] arr){
        if(arr==null || arr.length==0){return arr;}
        int temp=0,min=0;
        for(int i=0; i<arr.length-1;i++){
            min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
                if(i!=min){
                    temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
