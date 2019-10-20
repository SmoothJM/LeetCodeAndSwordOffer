package dataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class QAX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            s = Integer.parseInt(s) + "";
        } catch (Exception e) {
            System.out.println("错误输入");
        }
        int l = s.length();
        int n = Integer.parseInt(s);
        StringBuffer result = new StringBuffer();
        boolean flag = false;
        for (int i = 0; i < l; i++) {
            int base = (int) Math.pow(10, l - i - 1);
            int bit = l - i;
            int num = n / base % 10;
            result.append(find(num, 1));
            if (num != 0) {
                result.append(find(bit, 0));
                flag = false;
            } else {
                if(flag){
                    result.deleteCharAt(result.length()-1);
                }
                flag = true;
            }
            if(i==l-1 && num==0){
                result.deleteCharAt(result.length()-1);
            }

        }

        System.out.println(result);

    }

    public static String find(int n, int style) {
        Map<Integer, String> mapBit = new HashMap<>();
        Map<Integer, String> mapNum = new HashMap<>();
        mapBit.put(1, "");
        mapBit.put(2, "十");
        mapBit.put(3, "百");
        mapBit.put(4, "千");
        mapBit.put(5, "万");
        mapNum.put(0, "零");
        mapNum.put(1, "一");
        mapNum.put(2, "二");
        mapNum.put(3, "三");
        mapNum.put(4, "四");
        mapNum.put(5, "五");
        mapNum.put(6, "六");
        mapNum.put(7, "七");
        mapNum.put(8, "八");
        mapNum.put(9, "九");
        mapNum.put(10, "十");
        if (style == 0) {
            return mapBit.get(n);
        } else {
            return mapNum.get(n);
        }
    }
}
