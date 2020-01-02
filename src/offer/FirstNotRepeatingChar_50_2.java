package offer;

import java.util.HashSet;
import java.util.Set;

public class FirstNotRepeatingChar_50_2 {
    public static void main(String[] args) {
        String s1 = "We are students";
        String s2 = "aeioue";
        String s3 = "google";
        String s4 = "silent";
        String s5 = "listen";
        String s6 = "live";
        String s7 = "evil";
        System.out.println(solution1(s1, s2));
        System.out.println(solution2(s3));
        System.out.println(solution3(s1,s2));
        System.out.println(solution3(s2,s3));
        System.out.println(solution3(s4,s5));
        System.out.println(solution3(s6,s7));
    }

    /**
     * 从第一个字符串中删掉出现在第二个字符串中的字符
     *
     * @param s1
     * @param s2
     * @return
     */
    public static String solution1(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() <= 0 || s2.length() <= 0) return null;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            set.add(s2.charAt(i));
        }
        int len = s1.length();
        for (int i = 0; i < s1.length(); ) {
            char c = s1.charAt(i);
            if (set.contains(c)) {
                String temp = String.valueOf(c);
                s1 = s1.replace(temp, "");
            } else {
                i++;
            }
        }

        return s1;
    }

    /**
     * 删除重复的字符
     *
     * @param str
     * @return
     */
    public static String solution2(String str) {
        if (str == null || str.length() <= 0) return null;
        //可打印ascii码长度是256个
        boolean[] asc = new boolean[256];
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!asc[c]) {
                asc[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 字母异位词
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean solution3(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() <= 0 || s2.length() <= 0 || s1.length() != s2.length())
            return false;
        int[] asc = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            asc[s1.charAt(i)]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            asc[s2.charAt(i)]--;
        }
        for (int i = 0; i < asc.length; i++) {
            if (asc[i] != 0) return false;
        }
        return true;
    }
}
