package easy;

public class ExcelSheetColumnTitle_168 {
    public static void main(String[] args) {
        int[] a = {1,2,3,16,26,27,28,107,108,109,701,702,703};
        for (int i = 0; i < a.length; i++) {
            System.out.println(convertToTitle(a[i]));
        }
//        System.out.println(convertToTitle(702));
    }

    public static String convertToTitle(int n) {
        StringBuffer sb = new StringBuffer();
        while(n>26){
            int remind=0;
            remind = n%26;
            if(remind==0){
                n -= 1;
                remind += 26;
            }
            n=n/26;
            sb.append((char)(remind+64));
        }
        sb.append((char)(n+64));
        return sb.reverse().toString();
    }

    public static String convertToTitle2(int n){
        StringBuffer sb = new StringBuffer();
        while(n>0) {

        }
        return sb.reverse().toString();
    }
}
