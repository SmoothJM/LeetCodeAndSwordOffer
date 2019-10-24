package easy;

public class NumberOf1Bits_191 {
	public static void main(String[] args) {
		int a1 = 128;
		System.out.println(hammingWeight(a1));
	}

	public static int hammingWeight(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int count = 0;
		for (int i = 0; i < 32; i++) {
			if ((n & 1) == 1)
				count++;
			n >>= 1;
		}
		return count;
	}
}
