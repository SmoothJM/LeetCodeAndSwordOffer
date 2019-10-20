package dataStructure;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] array = new int[]{126, 339, 456, 789, 116, 53, 787, 100,9,93};
        System.out.println(Arrays.toString(sort(array)));
    }
    public static int[] sort(int[] arr){
        if(arr==null || arr.length==0){return arr;}
        /*
        1. 找到max值
        2. 找到max值位数
        3. 构建桶二维数组来存储arr(按0-9位顺序存)
        4. 构建一维数组追踪每一位存了几个数
        5. 找到原数组中每个元素当前位，存入桶中
        6. 取出来二维桶中的元素覆盖arr
        7. 循环5-6
         */
        //1. 找到max值
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        //2. 找到max值位数
        int maxDigit=1;
        while(max/10!=0){
            maxDigit++;
            max /= 10;
        }
        //3. 构建桶二维数组来存储arr(按0-9位顺序存)
        int[][] bucket = new int[10][arr.length];
        int base = 10;
        //分别循环遍历每一位
        for (int i = 0; i < maxDigit; i++) {
            //4. 构建一维数组追踪每一位存了几个数
            int[] bLength = new int[10];
            //5. 找到原数组中每个元素当前位，存入对应位的桶中
            for (int j = 0; j < arr.length; j++) {
                int whichBucket = arr[j]/(base/10)%10;
                bucket[whichBucket][bLength[whichBucket]] = arr[j];
                bLength[whichBucket]++;
            }
            base *= 10;
            //6. 取出来二维桶中的元素覆盖arr
            int k=0;
            for (int n = 0; n < bucket.length; n++) {
                for (int m = 0; m < bLength[n]; m++) {
                    arr[k++] = bucket[n][m];
                }
            }
            for(int[] a:bucket){
                System.out.println(Arrays.toString(a));
            }
            System.out.println(Arrays.toString(bLength));
            System.out.println("===================");
        }
        return arr;
    }
}
