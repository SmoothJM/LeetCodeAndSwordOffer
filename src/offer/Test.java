package offer;

public class Test {
    public static void main(String[] args) {
    	print1ToMaxOfNDigits(2);
    }
    public static void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
//        for (int k = 0; k < number.length; k++)
//            number[k] = '0';
        number[0] = '9';
        number[1] = '7';
        while (!increment(number)) {
            printCharNumber(number);
        }
    }  
     
    /**
     * 对字符串进行加一操作，number达到最大值后返回true
     * 最低位加一；所有位如果超过10，则进位
     */
    private static boolean increment(char[] number) {
        int nTakeOver = 0; // 代表进位
        for (int i = number.length - 1; i >= 0; i--) {
            int nSum = (number[i] - '0') + nTakeOver; // 当前位置数字
            // number[i]-'0'是把char转化为int，nTakeOver代表进位
            if (i == number.length - 1)
                nSum++;
            if (nSum >= 10) {
                if (i == 0)
                    return true; // 超出范围了
                nTakeOver = 1;
                nSum -= 10;
                number[i] = (char) (nSum + '0');
            } else {
                number[i] = (char) (nSum + '0');
                break; // 高位不变，可以直接跳出循环了
            }
        }
        return false;
    }
 
    /**
     * 打印字符数组形成的数字
     * 书中方法：利用布尔变量isBeginning0来从第一个非零字符打印
     */
    private static void printCharNumber(char[] number) {
        boolean isBeginning0 = true;
        for (int i = 0; i < number.length; i++) {
            if (isBeginning0 && (number[i] - '0') != 0) {
                isBeginning0 = false;
            }
            if (!isBeginning0) {
                // System.out.print(number[i] - '0');
                System.out.print(number[i]);
            }
        }
        System.out.println();
 
    }
 

}
