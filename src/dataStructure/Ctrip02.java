package dataStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class Ctrip02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> offer = new ArrayList<>();
        ArrayList<Integer> poll = new ArrayList<>();
        while (sc.hasNext()) {
            String[] s = sc.nextLine().split(" ");
            if (s[0].equals("offer")) {
                offer.add(Integer.parseInt(s[1]));
            } else {
                fn(offer, Integer.parseInt(s[1]));
            }
        }
    }

    public static void fn(ArrayList<Integer> nums, int n) {
        if (nums == null || nums.isEmpty()) {
            System.out.println(-1);
            return;
        }
        try{
            for (int i = 0; i < n; i++) {
                int index = findMin(nums);
                System.out.println(nums.get(index));
                nums.remove(index);
            }
        }catch(Exception e){
            System.out.println(-1);
        }
    }

    public static int findMin(ArrayList<Integer> nums) {
        int minIndex = 0;
        int temp = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < temp) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
