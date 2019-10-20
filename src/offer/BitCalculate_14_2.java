package offer;

import java.util.HashMap;
import java.util.Map;

public class BitCalculate_14_2 {
    public static void main(String[] args) {
        String a = "ab";
        System.out.println(col(a));
    }

    public static int col(String a){
        int result = 0;
        a = a.toUpperCase();
        for (int i = 0; i < a.length(); i++) {
            result += (int)Math.pow(26,a.length()-1-i)*fn(a.charAt(i));
        }
        return result;
    }

    public static int fn(Character c){
        return c-64;
    }
}
