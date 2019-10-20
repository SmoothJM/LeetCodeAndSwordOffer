package offer;

import java.util.Arrays;

public class ArrayDuplicate_03_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,1,6,2,5,3};
        System.out.println(search(arr));
//        System.out.println(search2(arr));
    }

    /**
     * 辅助数组，主要想测试如何判断此位置上有元素 借助辅助空间
     * @param arr
     * @return
     */
    public static int search(int[] arr){
        if(arr == null || arr.length==0){return -1;}
        for(int a: arr) {
            if(a<=0 || a>=arr.length ) {return -1;}
        }
        int[] a = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(a[arr[i]]==arr[i]){
                return arr[i];
            }else{
                a[arr[i]] = arr[i];
            }
        }
        return -1;
    }
}
