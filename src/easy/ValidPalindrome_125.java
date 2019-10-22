package easy;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }
    public static boolean isPalindrome(String s) {
        if(s==null || s.length()==0) return true;
        s=s.toLowerCase();
        boolean flag = true;
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            while(low<high && !isValidChar(s.charAt(low))){
                low++;
            }
            while(low<high && !isValidChar(s.charAt(high))){
                high--;
            }
            if(s.charAt(low)!=s.charAt(high)){
                flag = false;
                break;
            }
            low++;
            high--;
        }

        return flag;
    }

    public static boolean isValidChar(char c){
        return (c>='0' && c<='9') || (c>='a' && c<='z');
    }
}
