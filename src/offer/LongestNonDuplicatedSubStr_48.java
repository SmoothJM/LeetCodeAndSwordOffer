package offer;


public class LongestNonDuplicatedSubStr_48 {
    public static void main(String[] args) {
        String str = "arabcacft";//
        System.out.println(solution2(str));
    }

    /**
     * uncompleted solution by force
     *
     * @param str
     * @return
     */
    public static int solution1(String str) {
        if (str == null || str.length() == 0) return -1;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String s = str.substring(i, j);
                System.out.println(s);
            }
        }
        return -1;
    }

    /**
     * @param str
     * @return
     */
    public static int solution2(String str) {
        if (str == null || str.length() == 0) return -1;
        int curLen = 0;
        int preLen = 0;
        int maxLen = 0;
        int[] pos = new int[26];
        for (int i = 0; i < 26; i++) pos[i] = -1;
        for (int i = 0; i < str.length(); i++) {
            int cur = str.charAt(i) - 'a';
            if (pos[cur] < 0 || i - pos[cur] > preLen){
                curLen = preLen + 1;
            }else{
                curLen = i-pos[cur];
            }
            pos[cur] = i;
            if(maxLen<curLen){
                maxLen = curLen;
            }
            preLen = curLen;
        }
        return maxLen;
    }
}
