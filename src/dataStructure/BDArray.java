package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class BDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] s = sc.nextLine().split(" ");
        if (s == null
                || s.length == 0
                || s.length!=n
                || n<2 || n>50) {
            System.exit(1);
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        arr = sort(arr);
        int count=0;
        while (arr[arr.length]>=n){
            calc(arr,n);
            arr = sort(arr);
            count++;
        }
        System.out.println(count);
    }

    public static int[] sort(int[] arr){
        int temp = 0;
        int j=0;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static int[] calc(int[] arr,int n){
        for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i] + 1;
        }
        arr[arr.length-1] = arr[arr.length-1] - n;
        return arr;
    }
}
