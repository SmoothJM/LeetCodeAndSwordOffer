package offer;

public class BigNumberAdd_17_2 {

	public static void main(String[] args) {
		String a = "90365125412154940517049154174902574061504174095710485065710457154054547154159";
		String b = "994595698456984156984156984156987458745875841264123651021";
		add(a, b);

	}

	public static void add(String a, String b) {
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		StringBuffer sb = new StringBuffer();
		int temp = 0;
		int a_ = 0;
		int b_ = 0;
		while (i >= 0 || j >= 0) {
			a_ = i >= 0 ? a.charAt(i) - '0' : 0;
			b_ = j >= 0 ? b.charAt(j) - '0' : 0;
			temp = a_ + b_ + carry;
			carry = temp / 10;
			temp = temp % 10;
			sb.append(temp);
			i--;
			j--;

		}
		if(carry!=0) sb.append(1);
		System.out.println(sb.reverse().toString());
	}

}
