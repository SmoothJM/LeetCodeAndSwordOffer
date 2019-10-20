package test;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(0,3);
        System.out.println(Arrays.toString(l.toArray()));
    }
}
