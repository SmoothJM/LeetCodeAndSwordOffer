package dataStructure;

import java.util.Scanner;

public class Now03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int k = Integer.parseInt(nums[0]);
        int a = Integer.parseInt(nums[1]);
        int b = Integer.parseInt(nums[2]);
        int c = Integer.parseInt(nums[3]);
        int d = Integer.parseInt(nums[4]);
        double total = (b - a + 1) * (d - c + 1);
        int maxK = ((int) Math.pow(2, k)) - 1;
        int minK = 0 - (maxK + 1);
        double count = 0;
        for (int i = a; i <= b; i++) {
            for (int j = c; j <= d; j++) {
                int sum = i + j;
                if (sum < minK) {
                    count++;
                }else if(sum > maxK ){
                    count += b-j+1;
                    break;
                }
            }
        }
        double p = count / total;
        System.out.printf("%.6f", p);
    }

}
