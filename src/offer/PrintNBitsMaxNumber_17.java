package offer;

import java.util.Arrays;

public class PrintNBitsMaxNumber_17 {
	public static void main(String[] args) {
		plusOne(2);
	}

	public static void plusOne(int n) {
		boolean flag = true;
		char[] c = new char[n];
		for (int i = 0; i < n; i++) {
			c[i] = '0';
		}
		while (flag) {
			int carry = 0;
			int sum = 0;
			for (int i = c.length - 1; i >= 0; i--) {
				sum = c[i] - '0' + carry;
				if (i == c.length - 1) {
					sum = c[i] - '0' + 1;
				}
				if (sum == 10) {
					if(i==0) {
						flag = false;
					}else {
						carry = 1;
						c[i] = '0';
					}
				} else {
					c[i] = (char) (sum + '0');
					break;
				}
			}
			if(flag) {
				print(c);
			}
		}
	}

	private static void print(char[] c) {
		boolean flag = true;
		for (int i = 0; i < c.length; i++) {
			if(flag && c[i]!='0') {
				flag = false;
			}
			if(!flag) {
				System.out.print(c[i]);
			}
		}
		System.out.println();
		
	}
}
