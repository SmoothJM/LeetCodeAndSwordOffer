package offer;

public class StringOfNumber_20 {
	public static void main(String[] args) {
		char[] c1 = "5".toCharArray();
		char[] c2 = "+5.1".toCharArray();
		char[] c3 = "-5.".toCharArray();
		char[] c4 = ".5".toCharArray();
		char[] c5 = "2.5".toCharArray();
		char[] c6 = "5.5e10".toCharArray();
		char[] c7 = "5.5E+2".toCharArray();
		char[] c8 = "5.5E-9".toCharArray();
		char[] c9 = "5.5e5.5".toCharArray();//false
		char[] c10 = "5ad3.3".toCharArray();//false
		char[] c11 = "5.5.5".toCharArray();//false
		System.out.println(isNumeric(c1));
		System.out.println(isNumeric(c2));
		System.out.println(isNumeric(c3));
		System.out.println(isNumeric(c4));
		System.out.println(isNumeric(c5));
		System.out.println(isNumeric(c6));
		System.out.println(isNumeric(c7));
		System.out.println(isNumeric(c8));
		System.out.println(isNumeric(c9));
		System.out.println(isNumeric(c10));
		System.out.println(isNumeric(c11));
	}
	
	
	private static boolean isNumeric(char[] c1) {
		
		return false;
	}


	public static boolean scanInteger(char[] c) {
		
		return false;
	}
}
