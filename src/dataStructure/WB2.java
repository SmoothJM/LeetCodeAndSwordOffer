package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class WB2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,3,4,4,2,5,2,5,6,7};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }


}
