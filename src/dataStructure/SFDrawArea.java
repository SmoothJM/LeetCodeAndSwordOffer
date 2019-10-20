package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目描述：
 * 我们现在需要在一个二维网格上画一个封闭图形，你有两种操作：
 * 1. 连接一个1*1格子的对角线。
 * 2. 连接一个1*1格子的一条边。
 * 已知你每分钟只能选择一个操作，
 * 现在要求你画出一个面积至少为m的多边形，请问你至少需要多长时间？
 *
 * 输入第一行是一个数据组数T。(1<=T<=300)
 * 接下来有T行，每行一个正整数q，表示多边形至少要涵盖的面积（1<=q<=10^9）。
 *
 * 对于每一个q，输出一行，表示至少需要多少分钟。
 *
 * 例子
 * 输入：
 * 5
 * 1
 * 2
 * 3
 * 4
 * 5
 * 输出：
 * 4
 * 4
 * 6
 * 6
 * 7
 */
public class SFDrawArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int[] qs = new int[t];
        for (int i = 0; i < t; i++) {
            qs[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Arrays.toString(qs));
    }
}
