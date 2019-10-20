package easy;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight","cat"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==0) {return "";}
        String longest = "";
        longest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(longest)!=0){
                longest = longest.substring(0,longest.length()-1);
                if(longest=="") {return longest;}
            }
        }
        return longest;
    }


}
