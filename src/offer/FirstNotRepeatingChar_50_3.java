package offer;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar_50_3 {
    public static void main(String[] args) {
        String str = "google";
        split(str);
    }

    public static void split(String str){
        if(str==null || str.length()<=0) return;
        for (int i = 0; i < str.length(); i++) {
            solution(str.substring(0,i+1));
        }

    }

    public static void solution(String str){
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.get(c)==1) {
                System.out.println(c);
                break;
            }
        }
    }
}
