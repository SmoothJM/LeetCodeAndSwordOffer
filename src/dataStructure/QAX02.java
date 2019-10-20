package dataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class QAX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");

        if (s == null || s.length < 0) {
            System.out.println("-");
            System.exit(1);
        }
        int[] nums = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        findPeak(nums);
    }

    public static void findPeak(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int incre=1;
        int desce=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=list.size()>0?list.get(list.size()-1)+1:0;j<i;j++){
                if(nums[j]<=nums[j+1]){
                    incre++;
                }else{

                    incre=1;
                }
            }
            for(int k=i;k<nums.length-1;k++){
                if(nums[k]>nums[k+1]){
                    desce++;
                }else{
                    break;
                }
            }
            count = incre<desce?incre:desce;
            if(count!=1){
                list.add(i);
            }
            incre=1;
            desce=1;

        }

        if(list.size()==0){
            System.out.println("-");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(nums[list.get(i)]+" ");
        }
    }
}
