package easy;

public class ImplementStr_28 {
    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
    }

    public static int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle);
        if(needle.isEmpty()){return 0;}
        int hLength=haystack.length();
        int nLength=needle.length();
        char[] hChars = haystack.toCharArray();
        char[] nChars = needle.toCharArray();
        int i=0;
        int j=0;
        while (i<hLength && j<nLength){
            if(hChars[i]==nChars[j]){
                i++;
                j++;
            }else{
                i = i-j+1;
                j=0;
            }
        }
        if(j==nLength){
            return i-j;
        }else{
            return -1;
        }
    }
}
