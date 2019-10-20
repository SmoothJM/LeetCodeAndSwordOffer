package dataStructure;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Scanner;

public class BigPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        String num1 = nums[0];
        String num2 = nums[1];
        System.out.println(add(num1, num2));
        add2(num1,num2);
    }

    public static String add(String num1, String num2) {
        StringBuffer result = new StringBuffer("");
        int carry = 0;
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int n1 = 0;
        int n2 = 0;
        int curr = 0;
        while (l1 >= 0 || l2 >= 0) {
            n1 = l1 >= 0 ? num1.charAt(l1) - '0' : 0;
            n2 = l2 >= 0 ? num2.charAt(l2) - '0' : 0;
            curr = n1 + n2 + carry;
            carry = curr / 10;
            curr = curr % 10;
            result.append(curr);
            l1--;
            l2--;
        }
        if (carry != 0) {
            result.append(1);
        }
        return result.reverse().toString();

    }

    public static void add2(String s1, String s2) {
        if (s1 == null && s2 == null) {
            System.out.println(-1);
        } else if (s1 == null || s1.length() == 0) {
            System.out.println(s2);
        } else if (s2 == null || s2.length() == 0){
            System.out.println(s1);
        }
        StringBuffer result = new StringBuffer();
        int l1 = s1.length() - 1, l2 = s2.length() - 1;
        int n1 = 0, n2 = 0, curr = 0;
        int carry = 0;
        while (l1 >= 0 || l2 >= 0) {
            n1 = l1 >= 0 ? s1.charAt(l1) - '0' : 0;
            n2 = l2 >= 0 ? s2.charAt(l2) - '0' : 0;
            curr = n1 + n2 + carry;
            carry = curr / 10;
            curr = curr % 10;
            result.append(curr);
            l1--;
            l2--;
        }
        if(carry>0){
            result.append(1);
        }
        System.out.println(result.reverse().toString());

    }

}
