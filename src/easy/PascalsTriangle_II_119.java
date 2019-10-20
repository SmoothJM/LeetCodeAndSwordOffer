package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle_II_119 {
    public static void main(String[] args) {
        List<Integer> list = getRow(3);
        System.out.println(Arrays.toString(list.toArray()));
    }

    public static List<Integer> getRow(int rowIndex){
        //if (rowIndex == 0) return new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        outer.get(0).add(1);
        if(rowIndex==0){
            return outer.get(0);
        }
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> inner2 = new ArrayList<>();
            inner2.add(1);
            for (int j = 1; j <= i-1; j++) {
                List<Integer> temp = outer.get(i-1);
                inner2.add(temp.get(j-1) + temp.get(j));
            }
            inner2.add(1);
            outer.add(inner2);
        }
        return outer.get(rowIndex);
    }
}
