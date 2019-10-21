package offer;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class RegularExpressionMatch_19 {
	public static void main(String[] args) {
		char[] s1 = { 'a', 'c', 'a', 'b', 'c', 'd', 'd' };
		char[] s2 = { 'a', 'c', 'a', 'c', 'd', 'd' };
		char[] s3 = { 'a', 'c', 'a', 'b', 'b', 'b', 'c', 'd', 'd' };
		char[] s4 = { 'a', 'c', 'a', 'b', 'b', 'b', 'd', 'd', 'd' };
		char[] pattern = { 'a', '.', 'a', 'b', '*', 'c', 'd', 'd' };
		System.out.println(match(s1, pattern));
		System.out.println(match(s2, pattern));
		System.out.println(match(s3, pattern));
		System.out.println(match(s4, pattern));
	}

	/**
	 * （1）当模式中第二个字符不为“*”时：若当前字符相等，则字符串和模式都后移一个字符，继续调用函数进行比较；若不相等，则返回false。
	 * 
	 * （2）当模式中第二个字符为“*”时：若当前字符不相等，则模式后移两个字符，继续比较；若当前字符相等，则有三种情况：
	 * 
	 * 			1）字符串字符位置不变，模式后移两个字符，继续比较； //x*被忽略
	 * 
	 * 			2）字符串后移一个字符，模式后移两个字符，继续比较；
	 * 
	 * 			3）字符串后移一个字符，模式字符位置不变，继续比较。 // 可能*号前的字符在字符串中有多个： ab*cdd == abbbbcdd
	 */

	private static boolean match(char[] str, char[] pattern) {
		if (str == null || pattern == null)
			return false;
		return matchCore(str, 0, pattern, 0);
	}

	private static boolean matchCore(char[] str, int indexOfStr, char[] pattern, int indexOfPattern) {
		if (indexOfStr == str.length && indexOfPattern == pattern.length)
			return true;
		if (indexOfStr < str.length && indexOfPattern == pattern.length)
			return false;
		if (indexOfPattern + 1 < pattern.length && pattern[indexOfPattern + 1] == '*') {
			if ((indexOfStr < str.length && pattern[indexOfPattern] == '.')
					|| (indexOfStr < str.length && pattern[indexOfPattern] == str[indexOfStr])) {
				return matchCore(str, indexOfStr, pattern, indexOfPattern + 2)
						|| matchCore(str, indexOfStr + 1, pattern, indexOfPattern)
						|| matchCore(str, indexOfStr + 1, pattern, indexOfPattern + 2);
			} else {
				return matchCore(str, indexOfStr, pattern, indexOfPattern + 2);
			}
		}
		if (indexOfStr < str.length && (pattern[indexOfPattern] == str[indexOfStr] || pattern[indexOfPattern] == '.'))
			return matchCore(str, indexOfStr + 1, pattern, indexOfPattern + 1);
		return false;
	}

}
