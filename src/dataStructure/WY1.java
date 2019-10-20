package dataStructure;

import java.util.*;

public class WY1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int max = Integer.parseInt(s[0]) > Integer.parseInt(s[1]) ? Integer.parseInt(s[0]) : Integer.parseInt(s[1]);
        int min = Integer.parseInt(s[0]) < Integer.parseInt(s[1]) ? Integer.parseInt(s[0]) : Integer.parseInt(s[1]);
        int maxB = max;
        int minB = min;
        int divide = 0;//存最大公约数
        int time = 0; //存最小公倍数
        boolean flag = true;
        //求最大公约数
        while(maxB%minB!=0){
            int temp = maxB%minB;
            maxB = minB;
            minB = temp;
        }
        divide = minB;
        //求最小公倍数
        time = (max*min)/divide;
        System.out.println(divide+" "+time);
    }
}
