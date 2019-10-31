package easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {
	public static void main(String[] args) {
		String s = "anagam";
		String t = "nagram";
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t) {
		if(s==null && t==null || s.length()==0 && t.length()==0) return true;
		if(s.length()!=t.length()) return false;
		int length = s.length();
		Map<Character,Integer> sMap = new HashMap<>();
		Map<Character,Integer> tMap = new HashMap<>();
		for (int i = 0; i < length; i++) {
			if (sMap.containsKey(s.charAt(i))) {
				sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
			}else {
				sMap.put(s.charAt(i), 1);
			}
			if (tMap.containsKey(t.charAt(i))) {
				tMap.put(t.charAt(i), tMap.get(t.charAt(i))+1);
			}else {
				tMap.put(t.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> entry:sMap.entrySet()) {
			
			if(tMap.containsKey(entry.getKey()) && tMap.get(entry.getKey())==entry.getValue()) {
				continue;
			}else {
				return false;
			}
		}
        return true;
    }

}
