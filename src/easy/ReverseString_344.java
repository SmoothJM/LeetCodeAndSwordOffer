package easy;

import java.util.Arrays;

public class ReverseString_344 {
    public static void main(String[] args) {
        char[] c1 = {'h','e','l','l','o'};
        char[] c2 = {'h','e'};
        char[] c3 = {'h','e','l','o'};
        char[] c4 = {'h'};
        reverseString(c1);
        reverseString(c2);
        reverseString(c3);
        reverseString(c4);
    }
    public static void reverseString(char[] s) {
        if(s==null || s.length<2) return;
        int low = 0,high=s.length-1;
        char temp = '*';
        while(low<high){
            temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(s));
    }
}
