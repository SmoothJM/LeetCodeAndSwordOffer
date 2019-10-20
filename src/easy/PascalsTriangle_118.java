package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle_118 {
    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        System.out.println(Arrays.toString(list.toArray()));

    }

    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        outer.get(0).add(1);
        if(numRows==1){
            return outer;
        }
        for (int i = 2; i <= numRows; i++) {
            List<Integer> inner2 = new ArrayList<>();
            inner2.add(1);
            for (int j = 1; j <= i-2; j++) {
                List<Integer> temp = outer.get(i-2);
                inner2.add(temp.get(j-1) + temp.get(j));
            }
            inner2.add(1);
            outer.add(inner2);
        }
        return outer;
    }
}
