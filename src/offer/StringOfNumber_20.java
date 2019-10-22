package offer;

public class StringOfNumber_20 {
	public static void main(String[] args) {
		char[] c1 = ".".toCharArray();
		char[] c2 = "+5.1".toCharArray();
		char[] c3 = "-5.".toCharArray();
		char[] c4 = ".5".toCharArray();
		char[] c5 = "2.5".toCharArray();
		char[] c6 = "5.5e10".toCharArray();
		char[] c7 = "5.5E+2".toCharArray();
		char[] c8 = "156.72E-19".toCharArray();
		char[] c9 = "5.5e5.5".toCharArray();//false
		char[] c10 = "5ad3.3".toCharArray();//false
		char[] c11 = "5.5.5".toCharArray();//false
//		System.out.println(isNumeric(c1));
//		System.out.println(isNumeric(c2));
//		System.out.println(isNumeric(c3));
//		System.out.println(isNumeric(c4));
//		System.out.println(isNumeric(c5));
//		System.out.println(isNumeric(c6));
//		System.out.println(isNumeric(c7));
//		System.out.println(isNumeric(c8));
//		System.out.println(isNumeric(c9));
		System.out.println(isNumeric(c10));
		System.out.println(isNumeric(c11));
	}


	static private int inx;
	public static boolean isNumeric(char[] str) {
		if(str==null || str.length==0){
			return false;
		}
		inx = 0;
		boolean flag = scanInteger(str);
		//判断小数部分
		if(inx<str.length && str[inx]=='.'){
			inx = inx+1;
			flag = scanUInteger(str)||flag;     //解释a,见代码下方
		}
		//判断指数部分
		if(inx<str.length && (str[inx]=='e' || str[inx]=='E')){
			inx = inx+1;
			flag = flag&&scanInteger(str);
		}
		return flag&& inx>=str.length;
	}

	//判断是否是整数
	public static boolean scanInteger(char[] str){
		if(inx<str.length &&(str[inx]=='+' || str[inx]=='-')){
			inx = inx+1;
		}
		return scanUInteger(str);
	}

	//判断是否是无符号整数
	public static boolean scanUInteger(char[] str){
		int inx1=inx;
		while(inx<str.length && str[inx]>='0' && str[inx]<='9'){
			inx = inx + 1;
		}
		return inx>inx1;
	}
}
