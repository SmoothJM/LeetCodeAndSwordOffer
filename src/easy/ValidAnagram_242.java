package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {
	public static void main(String[] args) {
		String s = "ngmaa";
		String t = "ngzma";
		System.out.println(isAnagram4(s, t));
	}
	
	/**
	 * two maps
	 * @param s
	 * @param t
	 * @return
	 */
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

		if(sMap.size()!=tMap.size()) return false;
		for(Map.Entry<Character, Integer> entry:sMap.entrySet()) {
			char key = entry.getKey();
			int val = entry.getValue();
			if(!tMap.containsKey(key) || tMap.get(key)!=val) {
				return false;
			}
		}
        return true;
    }
	
	/**
	 * hash table
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean isAnagram2(String s, String t) {
		if(s==null && t==null || s.length()==0 && t.length()==0) return true;
		if(s.length()!=t.length()) return false;
		int[] containers = new int[26];
		for (int i = 0; i < s.length(); i++) {
			containers[s.charAt(i)-'a']++;
			containers[t.charAt(i)-'a']--;
		}
		for (int i = 0; i < containers.length; i++) {
			if (containers[i]!=0) {
				return false;
			}
		}
        return true;
    }
	
	/**
	 * early stopping
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean isAnagram3(String s, String t) {
		if(s==null && t==null || s.length()==0 && t.length()==0) return true;
		if(s.length()!=t.length()) return false;
		int[] containers = new int[26];
		for (int i = 0; i < s.length(); i++) {
			containers[s.charAt(i)-'a']++;
			
		}
		for (int i = 0; i < t.length(); i++) {
			containers[t.charAt(i)-'a']--;
			if (containers[t.charAt(i)-'a']<0) {
				return false;
			}
		}
        return true;
    }
	
	/**
	 * array.sort
	 * @param s
	 * @param t
	 * @return
	 */
	public static boolean isAnagram4(String s, String t) {
		if(s==null && t==null || s.length()==0 && t.length()==0) return true;
		if(s.length()!=t.length()) return false;
		char sc[] = s.toCharArray();
		char tc[] = t.toCharArray();
		Arrays.sort(sc);
		Arrays.sort(tc);
		
        return Arrays.equals(sc, tc);
    }

}
