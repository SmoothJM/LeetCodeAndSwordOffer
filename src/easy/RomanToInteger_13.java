package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
//        Map<String, Integer> map = new HashMap<>();
//        System.out.println(map.get("a"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        for (int i = 0; i < s.length(); ) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                result += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                result += map.get(s.substring(i, i + 1));
                i += 1;
            }
        }
        return result;
    }
}
