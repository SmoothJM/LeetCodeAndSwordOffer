package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class SLL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        String[] s2 = sc.nextLine().split(" ");
        if (s1 == null || s1.length == 0 || s2 == null || s2.length == 0) {
            System.exit(1);
        }
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s2[i]);
        }
        float temp = 0;
        float max = 0;
        float six = 0;
        for (int i = 0; i < m; i++) {
            temp += arr[i];
        }
        max = temp / m;
        six = temp;
        for (int i = 0; i < (n - m); i++) {
            for (int j = m + i; j < n; j++) {
                temp = temp + arr[j];
                if (max < (temp / (j + 1))) {
                    max = temp / (j + 1);
                }
            }
            temp = six;
            temp = temp - arr[i];
            temp = temp + arr[m + i];
            six = temp;
            if (max < temp / m) {
                max = temp / m;
            }
        }
        System.out.printf("%.3f", max);
//        System.out.println(Arrays.toString(s2));
    }
}
