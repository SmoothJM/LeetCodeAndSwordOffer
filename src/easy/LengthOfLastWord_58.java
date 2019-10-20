package easy;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));
    }

    public static int lengthOfLastWord(String s) {
//        if(s.trim().isEmpty()){return 0;}
//        StringBuffer sb = new StringBuffer(s.trim());
//        int a = sb.reverse().indexOf(" ");
//        return a==-1?sb.length():a;
        int count = 0;
        for (int i=s.length();i>0;){
            if(s.charAt(--i)!=' '){
                count++;
            }else if(count!=0){
                return count;
            }
        }
        return count;
    }
}
