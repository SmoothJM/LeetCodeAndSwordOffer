package dataStructure;

import java.util.*;
/**
 * import java.util.*;
 * class Main{
 *     public static void main(String args[]){
 *         int m;
 *         double sum,n;
 *         Scanner sc = new Scanner(System.in);
 *         while(sc.hasNext()){
 *             n=sc.nextInt();
 *             m=sc.nextInt();
 *             sum=0;
 *             for(int i=0;i<m;i++){
 *                 sum=sum+n;
 *                 n=Math.sqrt(n);
 *             }
 *             System.out.printf("%.2f",sum);
 *             System.out.println();
 *         }
 *     }
 * }
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 给定两个长度均为n的排列A和B。现想要交换A中元素的位置，使其变成B。
 * 已知交换A中第i个元素和第j个元素所需要的代价为|i−j|，问：A变成B的最小代价是多少？
 * <p>
 * 第一行一个整数n，表示排列的长度。(1 <= n <= 200000) 第二行n个整数，中间用空格隔开，表示排列A。
 * 保证1 <= Ai <= n，且不存在任意的i ≠ j，Ai == Aj。
 * 第三行n个整数，中间用空格隔开，表示排列B。保证1 <= Bi <= n，且不存在任意的i ≠ j，Bi == Bj。
 * <p>
 * 4
 * 4 2 1 3
 * 3 2 4 1
 * <p>
 * 3
 */
public class SFSwapCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if(n==0 || n==1){System.out.println(0);System.exit(1);}
        if(n>200000){System.out.println(0);System.exit(1);}
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        String[] as = sc.nextLine().split(" ");
        String[] bs = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(as[i]);
            c[i] = Integer.parseInt(as[i]);
            b[i] = Integer.parseInt(bs[i]);
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++){
            if(b[i]!=a[i]){
                sum1 = sum1 + swap(a,i,b[i])-i;
            }
        }
        for (int i = n-1; i >= 0; i--){
            if(b[i]!=c[i]){
                sum2 = sum2 + i-swap(c,i,b[i]);
            }
        }


        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum1>sum2?sum2:sum1);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(c));
    }
//    public static int swap(Map<Integer, Integer> map,int target){
    public static int swap(int[] arr,int index,int target){
        int result=-1;
        int temp = 0;
        for (int i=0;i<arr.length;i++) {
            if(arr[i]==target){
                result=i;
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                break;
            }
        }
        return result;
    }
}
