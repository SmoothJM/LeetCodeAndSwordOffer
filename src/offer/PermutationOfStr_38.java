package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PermutationOfStr_38 {
    public static void main(String[] args) {
        String str = "abc";

        System.out.println(Arrays.toString(permutation(str).toArray()));
    }
    public static ArrayList<String> permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return list;
        }
        collect(str.toCharArray(), 0, list);
        Collections.sort(list);
        return list;
    }

    private static void collect(char[] chars, int begin, ArrayList<String> list) {
        if (begin == chars.length - 1) {
            // 不能存入相同的排列
            String s = String.valueOf(chars);
            if (!list.contains(s)) {
                list.add(s);
                return;
            }
        }

        for (int i = begin; i < chars.length; i++) {
            swap(chars, i, begin);
            collect(chars, begin + 1, list);
            swap(chars, i, begin);
        }

    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[j];
        chars[j] = chars[i];
        chars[i] = temp;
    }

}
