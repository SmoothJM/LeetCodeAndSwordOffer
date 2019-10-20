package dataStructure;
/**
 * 题目描述：
 * 形如1, 1, 2, 3, 5, 8, 13, 21, 34, 55的数列，
 * 后一位是前面两位相加（斐波那契数列），
 * 写出函数要求找到第 N 位是多少，如：fib(3) => 3 ， fib(5) => 8,
 * 要求时间复杂度为O(n)。
 */

import java.util.Scanner;

public class MeiTuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            if(n>50){
                System.out.println(-1);
                System.exit(1);
            }
            if(n==1 || n==0){
                System.out.println(1);
                System.exit(1);
            }
            long first = 1;
            long second = 1;
            long sum = 0;
            for (int i = 2; i <= n; i++) {
                sum = first + second;
                first = second;
                second = sum;
            }
            System.out.println(sum);
        }
    }
}
