package easy;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        boolean flag = false;
        int original = x;
        int rev=0;
        if(x>=0){
            while(x!=0){
                int pop = x%10;
                rev = rev*10+pop;
                x = x/10;
            }
            if(rev==original) {
                flag = true;
            }
        }
        return flag;
    }
}
