package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString_387 {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "";
        String s4 = "aabbcc";
        String s5 = "a";
        String s6 = null;
        System.out.println(firstUniqChar(s1));
        System.out.println(firstUniqChar(s2));
        System.out.println(firstUniqChar(s3));
        System.out.println(firstUniqChar(s4));
        System.out.println(firstUniqChar(s5));
        System.out.println(firstUniqChar(s6));

    }

    public static int firstUniqChar(String s) {
        if (s == null || s.length() == 0) return -1;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
