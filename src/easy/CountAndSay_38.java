package easy;

public class CountAndSay_38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(30));
    }

    public static String countAndSay(int n) {
        if(n==1){return "1";}
        StringBuffer curr = new StringBuffer("1");
        StringBuffer result = new StringBuffer("");
        int count = 1;
        for (int i = 1; i < n; i++) {
            result = new StringBuffer();
            //result= "";
            Character c = curr.charAt(0);
            for (int j = 1; j <= curr.length(); j++) {
                if (j != curr.length()) {
                    if (curr.charAt(j) == c) {
                        count++;
                    } else {
                        result.append(count).append(c);
                        c = curr.charAt(j);
                        count = 1;
                    }
                } else {
                    result.append(count).append(c);
                    count = 1;
                }
            }
            curr = result;

        }
        return result.toString();
    }
}
