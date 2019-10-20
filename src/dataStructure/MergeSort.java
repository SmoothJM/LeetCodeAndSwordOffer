package dataStructure;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{54,12,45,22,5,16};
        System.out.println(Arrays.toString(split(array)));
    }

    public static int[] split(int[] arr){
        if(arr.length<=1){return arr;}
        int mid = arr.length/2;
        int[] leftArr = Arrays.copyOfRange(arr,0,mid);
        int[] rightArr = Arrays.copyOfRange(arr,mid,arr.length);
        return merge(split(leftArr),split(rightArr));
    }
    public static int[] merge(int[] a1,int[] a2){
        int i=0,j=0,k=0;
        int[] result = new int[a1.length+a2.length];
        while(i<a1.length && j<a2.length){
            if(a1[i]<=a2[j]){
                result[k++] = a1[i++];
            }else{
                result[k++] = a2[j++];
            }
        }
        while(i<a1.length ){
            result[k++] = a1[i++];
        }
        while(j<a2.length ){
            result[k++] = a2[j++];
        }
        return result;
    }

}
