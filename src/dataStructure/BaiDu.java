package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class BaiDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[2];

        int max = 0;
        for (int i = n; i >=2; i--) {
            for (int j = n-1; j >=1 ; j--) {
                result = lcmGcd(i,j);
                if(max<(result[0]-result[1])){
                    max = result[0]-result[1];
                }
            }
        }
        System.out.println(max);

//        System.out.println(Arrays.toString(lcmGcd(14,18)));
    }

    public static int[] lcmGcd(int a, int b){
        int[] result = new int[2];
        int min = a<b?a:b;
        int max = a>b?a:b;

        int temp = max%min;
        while(temp!=0){
            max = min;
            min = temp;
            temp = max%min;
        }
        result[1] = min;
        result[0] = (a*b)/min;
        return result;
    }
}
