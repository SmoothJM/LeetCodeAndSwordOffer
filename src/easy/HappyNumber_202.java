package easy;

public class HappyNumber_202 {
	public static void main(String[] args) {
		int n = 2;
		System.out.println(isHappy(n));
	}

	public static boolean isHappy(int n) {
		while(n!=1) {
			if(n==4) return false;
			String s = n+"";
			n=0;
			for (int i = 0; i < s.length(); i++) {
				int temp = s.charAt(i)-'0';
				n += temp*temp;
			}
		}
		return true;
	}
	
	
}
