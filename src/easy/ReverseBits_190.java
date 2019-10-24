package easy;

public class ReverseBits_190 {
	public static void main(String[] args) {
		int a = -3;
		System.out.println(reverseBits(a));
	}
	
	public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
			result <<= 1;
			result += n&1;
			n >>=1;
		}
        return result;
    }
}
