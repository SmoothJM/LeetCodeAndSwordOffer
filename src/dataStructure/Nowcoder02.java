package dataStructure;

import java.util.Scanner;

public class Nowcoder02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nm = sc.nextLine().split(" ");
        int length = Integer.parseInt(nm[0]);
        int time = Integer.parseInt(nm[1]);
        String bits = sc.nextLine();
        while (time > 0) {
            nm = sc.nextLine().split(" ");
            int x = Integer.parseInt(nm[0]);
            int y = Integer.parseInt(nm[1]);
            bits = flip(length, x, y, bits);
            time--;
        }
        System.out.println(bits);
    }

    public static String flip(int length, int left, int right, String bits) {
        int temp = 0;
        if (left > right) {
            temp = left;
            left = right;
            right = temp;
        }
        left--;
//        char[] sub = bits.substring(left, right).toCharArray();
//        for (int i = 0; i < sub.length; i++) {
//            sub[i] ^= 1;
//        }
        int midBit = Integer.parseInt(bits.substring(left, right),2);
        midBit ^= 1;
        String mid = Integer.toBinaryString(midBit);
        String start = bits.substring(0, left);
        String end="";
        if (right != length) {
            end = bits.substring(right);
        }
//        String mid = String.valueOf(sub);
        bits = start+mid+end;
        return bits;
    }
}
