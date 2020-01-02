package offer;

public class UglyNumber_49 {
    public static void main(String[] args) {
        solution1(1500);
        System.out.println(solution2(1500));

    }


    /**
     * 需要计算每个数字，包括非丑数
     * @param index
     * @return
     */
    public static int solution1(int index){
        if(index<1) return 0;
        int count = 1;
        int num = 1;
        while(count<index){
            num++;
            if(isUgly(num)) {
                count++;
                System.out.println(num);
            }
        }
        return num;
    }

    public static boolean isUgly(int num){
        while(num%2==0) num/=2;
        while(num%3==0) num/=3;
        while(num%5==0) num/=5;
        return num==1;
    }

    /**
     * 不需要计算每个数字，只找丑数.
     * 主要思路是下一个丑数一定是前面某个丑数的2或3或5倍
     * @param index
     * @return
     */
    public static int solution2(int index){
        if(index<1) return 0;
        int[] uglyNums = new int[index];
        uglyNums[0] = 1;
        int next = 1;
        int m2 = 0;
        int m3 = 0;
        int m5 = 0;
        while(next<index){
            int min = minNum(uglyNums[m2]*2,uglyNums[m3]*3,uglyNums[m5]*5);
            uglyNums[next] = min;
            while(uglyNums[m2]*2<=uglyNums[next]) m2++;
            while(uglyNums[m3]*3<=uglyNums[next]) m3++;
            while(uglyNums[m5]*5<=uglyNums[next]) m5++;

            next++;
        }

        return uglyNums[index-1];
    }

    public static int minNum(int a, int b, int c){
        int min = (a<b)?a:b;
        return (min<c)?min:c;
    }
}
