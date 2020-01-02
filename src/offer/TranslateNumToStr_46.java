package offer;

public class TranslateNumToStr_46 {
    public static void main(String[] args) {
        int num = 999;
        System.out.println(solution(num));
    }

    public static int solution(int num){
        if(num<0) return -1;
        String snum = String.valueOf(num);
        int len = snum.length();
        int[] counts = new int[len];
        for (int i = len-1; i >=0 ; i--) {
            if(i==len-1) counts[i] = 1;
            else {
                counts[i] = counts[i+1];
                int a = snum.charAt(i)-'0';
                int b = snum.charAt(i+1)-'0';
                int cov = a*10+b;
                if(cov>=10 && cov<=25){
                    if(i==len-2) counts[i]++;
                    else counts[i] += counts[i+2];
                }
            }

        }
        return counts[0];
    }
}
