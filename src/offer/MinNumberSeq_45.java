package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinNumberSeq_45 {
    public static void main(String[] args) {
        int[] nums = {3,32,321};
        System.out.println(solution(nums));
    }

    public static String solution(int[] numbers){
        if(numbers==null || numbers.length<=0) return "";
        ArrayList<String> list = new ArrayList<>();
        for (int num:numbers) {
            list.add(String.valueOf(num));
        }
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String a = s1+s2;
                String b = s2+s1;
                return a.compareTo(b);
            }
        });
        StringBuffer sb = new StringBuffer();
        for (String temp:list) {
            sb.append(temp);
        }
        return sb.toString();
    }
}
