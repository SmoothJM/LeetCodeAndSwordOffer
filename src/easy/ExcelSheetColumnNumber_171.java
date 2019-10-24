package easy;

public class ExcelSheetColumnNumber_171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("zy"));
    }

    public static int titleToNumber(String s) {
        if(s==null || s.length()==0) return -1;
        s=s.toUpperCase();
        int length = s.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += toInt(s.charAt(i))*Math.pow(26,(length-1-i));
        }
        return sum;
    }

    public static int toInt(char c){
        return c-64;
    }

    public static int titleToNumber2(String s) {
        if (s == null || s.length() == 0) return -1;
        s = s.toUpperCase();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'A' + 1;
            ans = ans * 26 + num;
        }
        return ans;

    }
}
