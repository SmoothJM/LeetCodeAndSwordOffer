package offer;

import java.util.Arrays;
import java.util.Hashtable;

public class ArrayDuplicate_03 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,0,2,5,3};
        System.out.println(search(arr));
        System.out.println(search2(arr));
    }

    /**
     * 用哈希表实现 借助辅助空间
     * @param arr
     * @return
     */
    public static int search(int[] arr){
        if(arr==null || arr.length==0){return -1;}
        for(int i=0; i<arr.length;i++){
            if(arr[i]>=arr.length || arr[i]<0) {return -1;}
        }
        Hashtable<Integer,Integer> ht = new Hashtable<>();
        for(int i=0;i<arr.length;i++){
            if(ht.contains(arr[i])){
                return arr[i];
            }else{
                ht.put(i,arr[i]);
            }
        }
        return -1;
    }

    /**
     * 用交换位置方法 不借助辅助空间
     * @param arr
     * @return
     */
    public static int search2(int[] arr){
        if(arr==null || arr.length==0){return -1;}
        for(int a:arr){
            if(a<0 || a>=arr.length){return -1;}
        }

        for(int i=0; i<arr.length; i++){
            System.out.println("------------ "+i);
            while(i != arr[i]){
                if(arr[i] == arr[arr[i]]){
                    return arr[i];
                }
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
            System.out.println(Arrays.toString(arr));
            }
        }

        return -1;
    }

}
