package offer;

import java.util.Arrays;

public class VerifySquenceOfBST_33 {
	public static void main(String[] args) {
		int[] a1 = {5,7,6,9,11,10,8};
		int[] a2 = {7,4,6,5};
		System.out.println(VerifySquenceOfBST(a1));
		System.out.println(VerifySquenceOfBST(a2));
	}

	public static boolean VerifySquenceOfBST(int[] seq) {
		
		if(seq==null || seq.length==0) return false;
		int root = seq[seq.length-1];
		int i=0;
		for(;i<seq.length-1;i++) {
			if(seq[i]>root) break;
		}
		int j=i;
		for (; j < seq.length-1; j++) {
			if(seq[j]<root) return false;
		}
		boolean left = true;
		boolean right = true;
		if(i>0) {
			left = VerifySquenceOfBST(Arrays.copyOfRange(seq, 0, i));
		}
		if(i<seq.length-1) {
			right = VerifySquenceOfBST(Arrays.copyOfRange(seq, i, seq.length-1));
		}
		return left && right;
	}
}
