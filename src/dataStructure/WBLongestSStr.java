package dataStructure;

import java.util.*;

public class WBLongestSStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s == null || s.length()==0){
            System.out.print("  0");
        }
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        int max=0;
        char result=' ';
        for (Map.Entry<Character,Integer> m : map.entrySet()){
            if(max<m.getValue()){
                max = m.getValue();
                result = m.getKey();
            }
        }


        System.out.println(result+" "+max);
    }
}
